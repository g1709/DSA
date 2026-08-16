# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def isPalindrome(self, head):
        """
        :type head: Optional[ListNode]
        :rtype: bool
        """
        ans = []
        slow = head
        while slow != None:
            ans.append(slow.val)
            slow = slow.next
        return ans == ans[::-1]
            
        