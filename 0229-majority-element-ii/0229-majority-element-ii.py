class Solution(object):
    def majorityElement(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        n = len(nums)
        ans = []
        freq = {}
        for num in nums:
            freq[num] = freq.get(num, 0)+1
        for num, count in freq.items():
            if count > n//3:
                ans.append(num)
        return ans
        


        