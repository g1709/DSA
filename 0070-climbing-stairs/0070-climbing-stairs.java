class Solution {
    static int dp[];
    public static int solve(int i, int n){
        if(i==n) return 1;
        if(i>n) return 0;
        if(dp[i]!=-1) return dp[i];
        int  one =solve(i+1, n);
        int two = solve(i+2, n);
        return  dp[i] = one + two;
    }


    public int climbStairs(int n) {
        dp = new int[n+1];
        Arrays.fill(dp, -1);
        return solve(0, n);
        
    }
}