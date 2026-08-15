class Solution(object):
    def reverse(self, x):
        """
        :type x: int
        :rtype: int
        """
        INT_MAX = 2**31-1
        INT_MIN = -2**31
        flag = False
        if x < 0:
            flag = True
            x = x*-1
        ans = 0
        while x != 0:
            temp = x%10
            ans = ans*10+temp
            x = x//10
        if flag == True:
            ans = ans * -1

        if ans > INT_MAX or ans < INT_MIN:
                return 0
        return ans
        