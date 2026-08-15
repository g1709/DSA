class Solution(object):
    def maxSubArray(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        ans = 0
        maxi = nums[0]
        for i in range(len(nums)):
            ans += nums[i]
            maxi = max(maxi, ans)
            if ans < 0:
                ans = 0
        return maxi

        