class Solution(object):
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        mini = prices[0]
        profit = 0
        for i in range(len(prices)):
            temp = prices[i]-mini
            profit = max(profit, temp)
            if mini > prices[i]:
                mini = prices[i]
        return profit


        