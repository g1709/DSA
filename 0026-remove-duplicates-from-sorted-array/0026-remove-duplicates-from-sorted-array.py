class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        s = sorted(set(nums))
        for  i in range(len(s)):
            nums[i] = s[i]
        
        return len(s)