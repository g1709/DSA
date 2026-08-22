class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        dup=x
        if x<0:
            return False
        
        value = 0
        while x>0:
            temp = x%10
            value = value*10+temp
            x=x//10
        return value==dup
