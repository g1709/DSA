class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        unique = sorted(set(nums))
        for i in range(len(unique)):
            nums[i] = unique[i]
        return len(unique)
        