class Solution(object):
    def merge(self, nums1, m, nums2, n):
        """
        :type nums1: List[int]
        :type m: int
        :type nums2: List[int]
        :type n: int
        :rtype: None Do not return anything, modify nums1 in-place instead.
        """
        ans = []
        for i in range(m):
            ans.append(nums1[i])
        for i in range(n):
            ans.append(nums2[i])
        for i in range(len(ans)):
            nums1[i] = ans[i]

        nums1.sort()
        
        