class Solution(object):
    def searchRange(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        n = len(nums)-1
        result = []
        first = -1
        low=0
        high=n
        while low<=high:
            mid = (low+high)//2
            if nums[mid]==target:
                first=mid
                high=mid-1
            elif nums[mid]<target:
                low=mid+1
            else:
                high=mid-1
        result.append(first)    

        low=0
        high=n
        second=-1
        while low<=high:
            mid = (low+high)//2
            if nums[mid]==target:
                second=mid
                low=mid+1
            elif nums[mid]<target:
                low=mid+1
            else:
                high=mid-1
        result.append(second)
        return result

        