class Solution(object):
    def maxDepth(self, s):
        """
        :type s: str
        :rtype: int
        """
        count=0
        maxi=0
        for ch in  s:
            if ch == '(':
                count+=1
                maxi = max(maxi, count)
            elif ch == ')':
                count-=1
        return maxi
        