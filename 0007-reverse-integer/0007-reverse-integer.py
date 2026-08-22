class Solution(object):
    def reverse(self, x):
        """
        :type x: int
        :rtype: int
        """
        value = 0
        count=0
        if x<0:
            count=count+1
        x=abs(x)
        while x!=0:
            temp=x%10
            value=value*10+temp
            x=x//10
        if count==1:
            value=value*-1

        if value < -2**31 or value > 2**31 - 1:
            return 0
        return value


        