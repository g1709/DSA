class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        list = set()
        for num in nums:
            list.add(num)
        list = sorted(list)
        for i, num in enumerate(list):
            nums[i] = num
        return len(list)
