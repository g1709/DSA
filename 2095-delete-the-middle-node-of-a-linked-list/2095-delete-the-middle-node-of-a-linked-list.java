/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }
        ListNode dummy = new ListNode(0);
        ListNode dummy1 = dummy;
        int target = list.size()/2;
        for(int i=0; i<list.size(); i++){
            int v = list.get(i);
            if(i==target){
                continue;
            }
            else{
                dummy1.next = new ListNode(v);
                dummy1 = dummy1.next;

            }
        }
        return dummy.next;
        
    }
}