# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def removeNthFromEnd(self, head, n):
        """
        :type head: Optional[ListNode]
        :type n: int
        :rtype: Optional[ListNode]
        """

        count=0
        temp = head
        while(temp!=None):
            temp = temp.next
            count+=1
        target = count-n
        ans = []
        t = head
        while t!=None:
            ans.append(t.val)
            t=t.next
        answer = []
        for i in range(len(ans)):
            if target == i:
                continue
            else:
                answer.append(ans[i])
        dummy = ListNode(0)
        dummy1 = dummy
        for var in answer:
            dummy1.next = ListNode(var)
            dummy1 = dummy1.next
        return dummy.next

        