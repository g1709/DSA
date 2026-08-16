class Solution(object):
    def findPeakElement(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        idx=0
        mini = nums[0]
        for i in range(len(nums)):
            if nums[i]>mini:
                mini=nums[i]
                idx=i
        return idx