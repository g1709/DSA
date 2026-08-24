class Solution(object):
    def subarraySum(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        freq = {0:1}
        sum = 0
        count = 0
        for num in nums:
            sum+=num
            complement = sum-k
            if complement in freq:
                count+=freq[complement]
            freq[sum] = freq.get(sum, 0)+1
        return count

        
        