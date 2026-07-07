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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry=0;
        ArrayList<Integer> ans = new ArrayList<>();
        ListNode one = l1;
        ListNode two = l2;
        while(one!=null && two!=null){
        int sum = (one.val + two.val + carry)%10;
        ans.add(sum);
         carry = (one.val + two.val + carry) / 10;
         one = one.next;
         two = two.next;
        }
        //if(carry>0) ans.add(carry);
        while(one!=null){
            int temp = (one.val + carry)%10;
            ans.add(temp);
            carry = (one.val + carry) / 10;
            one = one.next;
        }
        while(two!=null){
            int temp = (two.val + carry)%10;
            ans.add(temp);
            carry = (two.val + carry) / 10;
            two = two.next;
        }
        if(carry>0) ans.add(carry);
        ListNode dummy = new ListNode(0);
        ListNode dummy1 = dummy;
        for(int v : ans){
            dummy1.next = new ListNode(v);
            dummy1 = dummy1.next;
        }
        return dummy.next;
    }
}