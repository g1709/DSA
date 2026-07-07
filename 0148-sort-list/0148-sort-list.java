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
    public ListNode sortList(ListNode head) {
        ArrayList<Integer> ans = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            ans.add(temp.val);
            temp=temp.next;
        }

        Collections.sort(ans);
        ListNode dummy = new ListNode(0);
        ListNode dummy1 = dummy;
        for(int v : ans){
            dummy1.next = new ListNode(v);
            dummy1 = dummy1.next;
        }
        return dummy.next;
        
    }
}