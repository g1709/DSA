class Solution {
    static int dp[];
    public static int solve(int i, int end, int[] nums){
        if(i>end) return 0;
        if(dp[i]!=-1) return dp[i];
        int take = nums[i] + solve(i+2, end, nums);
        int not = solve(i+1, end, nums);
        return dp[i] =  Math.max(take, not); 
    }



    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0];
         dp = new int[n+1];
        Arrays.fill(dp, -1);
        int one = solve(0, n-2, nums);
         dp = new int[n+1];
        Arrays.fill(dp, -1);
        int two = solve(1, n-1, nums);
        return Math.max(one, two);
        
    }
}