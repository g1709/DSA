class Solution(object):
    def longestConsecutive(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """

        count = 1
        nums.sort()
        maxi = 1
        n = len(nums)
        if n == 0: return 0
        for i in range(len(nums)-1):
            if nums[i] == nums[i+1]:
                continue
            elif nums[i]+1 == nums[i+1]:
                count+=1
                maxi = max(maxi, count)
            else:
                count=1
        return maxi
        