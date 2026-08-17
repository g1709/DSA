# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def sortList(self, head):
        """
        :type head: Optional[ListNode]
        :rtype: Optional[ListNode]
        """
        ans = []
        temp = head
        while temp != None:
            ans.append(temp.val)
            temp = temp.next
        ans.sort()
        dummy = ListNode(0)
        dummy1 = dummy
        for num in ans:
            dummy1.next = ListNode(num)
            dummy1 = dummy1.next
        return dummy.next
        