class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int n = prices.length;
        int min=prices[0];
        for(int i=0; i<n; i++){
            int temp = prices[i]-min;
            profit=Math.max(profit, temp);
            min= Math.min(min, prices[i]);
        }
        return profit;
    }
}