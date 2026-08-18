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
        list = []
        temp = head
        while temp != None:
            list.append(temp.val)
            temp = temp.next
        list.sort()
        dummy = ListNode(0)
        dummy1 = dummy
        for num in list:
            dummy1.next = ListNode(num)
            dummy1 = dummy1.next
        return dummy.next
        