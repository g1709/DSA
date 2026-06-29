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
        ArrayList<Integer> ans = new ArrayList<>();
        ListNode one = l1;
        ListNode two = l2;
        int carr=0;
        while(one!=null && two!=null){
            int sum =  one.val+two.val+carr;
            int temp = sum%10;
            int t  = sum/10;
            ans.add(temp);
            carr=t;
            one=one.next;
            two=two.next;
            
        }
        while(one!=null){
            int sum=one.val+carr;
            int temp=sum%10;
            int t = sum/10;
            ans.add(temp);
            carr=t;
            one=one.next;

        }
        
        while(two!=null){
            int sum=two.val+carr;
            int temp=sum%10;
            int t = sum/10;
            ans.add(temp);
            carr=t;
            two=two.next;

        }

        if(carr>0){
        ans.add(carr);
        }
        ListNode dummy = new ListNode(0);
        ListNode dummy1 = dummy;
        for(int v : ans){
            dummy1.next = new ListNode(v);
            dummy1=dummy1.next;
        }
        return dummy.next;
    }
}