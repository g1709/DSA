class Solution(object):
    def isAnagram(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        si = sorted(s)
        ti = sorted(t)
        return si == ti
        