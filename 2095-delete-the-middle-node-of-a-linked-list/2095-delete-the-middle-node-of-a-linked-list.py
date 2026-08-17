# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def deleteMiddle(self, head):
        """
        :type head: Optional[ListNode]
        :rtype: Optional[ListNode]
        """
        ans = []
        temp = head
        while temp != None:
            ans.append(temp.val)
            temp = temp.next
        tar = len(ans)/2

        answer = []
        for i in range(len(ans)):
            if i==tar:
                continue
            else:
                answer.append(ans[i])
        dummy = ListNode(0)
        dummy1 = dummy
        for a in answer:
            dummy1.next = ListNode(a)
            dummy1 = dummy1.next
        return dummy.next

        