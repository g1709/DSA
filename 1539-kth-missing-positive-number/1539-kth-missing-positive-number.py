class Solution(object):
    def findKthPositive(self, arr, k):
        """
        :type arr: List[int]
        :type k: int
        :rtype: int
        """
        count=0
        num=1
        arr_set = set(arr)
        while True:
            if num not in arr_set:
                count+=1
                if count==k:
                    return num
            num+=1
        