class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        unique = sorted(set(nums))
        for i,num in enumerate(unique):
            nums[i] = num
        return len(unique)