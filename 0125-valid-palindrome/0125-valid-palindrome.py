class Solution(object):
    def isPalindrome(self, s):
        """
        :type s: str
        :rtype: bool
        """
        filtered=""
        for ch in s:
            if ch.isalnum():
                filtered+=ch.lower()
        return filtered==filtered[::-1]