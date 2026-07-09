class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int mini = prices[0];
        int profit=0;
        for(int i=0; i<n; i++){
            if(mini>prices[i]){
                mini=prices[i];
            }
            int temp = Math.abs(mini-prices[i]);
            profit=Math.max(profit, temp);
        }
        return profit;
    }
}