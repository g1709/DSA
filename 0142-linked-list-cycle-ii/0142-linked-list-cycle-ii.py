# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def detectCycle(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        slow = head
        fast = head
        while fast != None and fast.next != None :
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                nye = head
                while slow != None:
                    if slow == nye: return slow
                    slow = slow.next
                    nye = nye.next
        return None
        