class Solution {
    public int maxProfit(int[] prices) {
        int minvalue = prices[0];
        int profit =0;
        for(int i=0; i<prices.length; i++){
            int temp = prices[i]-minvalue;
            profit = Math.max(temp, profit);

            if(minvalue>prices[i]){
                minvalue = prices[i];
            }

        }
        return profit;
        
    }
}