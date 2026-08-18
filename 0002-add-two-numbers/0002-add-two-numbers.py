# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def addTwoNumbers(self, l1, l2):
        """
        :type l1: Optional[ListNode]
        :type l2: Optional[ListNode]
        :rtype: Optional[ListNode]
        """
        one = l1
        two = l2
        ans = []
        carry = 0
        while one!=None and two!=None:
            sum = (one.val+two.val+carry)%10
            ans.append(sum)
            carry = (one.val+two.val+carry)//10
           
            one=one.next
            two=two.next
        while one!=None:
            sum = (one.val+carry)%10
            ans.append(sum)
            carry = (one.val+carry)//10
            
            one = one.next
        while two!=None:
            sum = (two.val+carry)%10
            ans.append(sum)
            carry = (two.val+carry)//10
           
            two = two.next
        if carry>0:
            ans.append(carry)
        
        dummy = ListNode(0)
        dummy1 = dummy
        for num in ans:
            dummy1.next = ListNode(num)
            dummy1 = dummy1.next
        return dummy.next
            

        