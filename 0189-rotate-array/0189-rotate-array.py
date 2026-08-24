class Solution(object):
    def rotate(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        n = len(nums)
        list = [0]*n
        for i, num in enumerate(nums):
            list[(i+k)%n] = num
        for i, num in enumerate(list):
            nums[i] = num
            
        