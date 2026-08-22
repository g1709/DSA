class Solution(object):
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """
        seen = set()
        i=0
        j=0
        count=0
        maxi=0
        for i, ch in enumerate(s):
            while ch in seen:
                seen.remove(s[j])
                j+=1
            seen.add(ch)
            
            maxi = max(maxi, i-j+1)
        return maxi
            
        