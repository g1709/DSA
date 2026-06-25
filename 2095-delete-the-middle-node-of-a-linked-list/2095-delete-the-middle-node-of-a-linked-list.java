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
        ArrayList<Integer> ans = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            ans.add(temp.val);
            temp=temp.next;
        }

        int tar = ans.size()/2;
        ListNode dummy = new ListNode(0);
        ListNode dummy1 = dummy;
        for(int i=0; i<ans.size(); i++){
            if(i==tar){
                continue;
            }
            dummy1.next = new ListNode(ans.get(i));
            dummy1=dummy1.next;
        }
        return dummy.next;
        
    }
}