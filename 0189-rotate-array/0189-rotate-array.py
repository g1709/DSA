class Solution(object):
    def rotate(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        n = len(nums)
        k=k%n
        ans = [0]*n
        for i in range(len(nums)):
            ans[(i+k)%n] = nums[i]
        for i in range(len(ans)):
            nums[i] = ans[i]
        