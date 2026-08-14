class Solution(object):
    def maxSubArray(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        maxi = nums[0]
        
        sum = 0
        for i in range(len(nums)):
            sum+=nums[i]
            maxi=max(sum, maxi)
            if sum<0:
                sum=0
        return maxi

        