class Solution {
    static int dp[];
    public static int solve(int n){
        if(n==0) return 1;
        if(n==1) return 1;
        if(dp[n]!=-1) return dp[n];
        int one = solve(n-1);
        int two = solve(n-2);
        return dp[n] = one + two;
    }


    public int climbStairs(int n) {
        dp = new int[n+1];
        Arrays.fill(dp, -1);
        return solve(n);
        
    }
}