# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def oddEvenList(self, head):
        """
        :type head: Optional[ListNode]
        :rtype: Optional[ListNode]
        """
        one = []
        if head == None or head.next == None:
            return head
        slow = head
        while slow!=None:
            one.append(slow.val)
            if slow.next != None and  slow.next.next != None :
                slow=slow.next.next
            else:
                break


            
        two = []
        slow = head.next
        while slow!=None:
            two.append(slow.val)
            if slow.next != None and slow.next.next != None:
                slow = slow.next.next
            else:
                break
            

        final = one + two
        dummy1 = ListNode(0)
        dummy2 = dummy1
        for num in final:
            dummy2.next = ListNode(num)
            dummy2 = dummy2.next
        return dummy1.next
        