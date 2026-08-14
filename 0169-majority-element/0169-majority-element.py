class Solution(object):
    def majorityElement(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        freq = {}
        for num in nums:
            freq[num] = freq.get(num, 0)+1
        
        for numbers in nums:
            temp = freq.get(numbers)
            if temp > len(nums)/2:
               return numbers
        return -1