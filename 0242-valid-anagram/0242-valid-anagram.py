class Solution(object):
    def isAnagram(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        freq = {}
        for ch in s:
            freq[ch] = freq.get(ch, 0)+1
        for ch in t:
            if ch not in freq or freq[ch] == 0:
                return False
            freq[ch] = freq.get(ch, 0)-1

        for v in freq.values():
            if v>0:
                return False

        return True