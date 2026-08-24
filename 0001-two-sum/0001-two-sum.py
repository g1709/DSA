class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """

        freq = {}
        for i, num in  enumerate(nums):
            complement = target-num
            if complement in freq:
                return [freq[complement], i]
            freq[num] = i

        return [-1,-1]

        