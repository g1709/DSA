class Solution(object):
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        minvalue = prices[0]
        profit = 0
        for num in prices:
            temp = num-minvalue
            profit = max(profit, temp)
            if minvalue > num:
                minvalue = num
        return profit
            
        