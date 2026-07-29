class Solution {
    static int dp[];
    public static int solve(int i, int[] nums){
        if(i>=nums.length) return 0;
        if(dp[i]!=-1) return dp[i];
        int take = nums[i] + solve(i+2, nums);
        int not = solve(i+1, nums);
        return dp[i] = Math.max(take, not);

    }


    public int rob(int[] nums) {
        int n = nums.length;
        dp = new int[n+1];
        Arrays.fill(dp, -1);
        return solve(0, nums);
        
    }
}