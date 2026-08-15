class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        freq =  {}
        for i in range (len(nums)):
            complement = target - nums[i]
            if complement in freq:
                return [freq[complement], i]
            freq[nums[i]] = i
        return [-1, -1]
        