class Solution {
    public static int solve(int dp[], int i, int[] cost){
        if(i>=cost.length) return 0;
        if(dp[i]!=-1) return dp[i];
        int one = cost[i]+solve(dp, i+1, cost);
        int two = cost[i]+solve(dp, i+2, cost);
        return dp[i] = Math.min(one, two);
    }


    public int minCostClimbingStairs(int[] cost) {
        int dp[] = new int[cost.length+1];
        Arrays.fill(dp, -1);
        return Math.min(solve(dp, 0, cost), solve(dp, 1, cost));
        
    }
}