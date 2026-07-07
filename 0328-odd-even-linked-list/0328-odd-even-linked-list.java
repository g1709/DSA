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
    public ListNode oddEvenList(ListNode head) {
        ArrayList<Integer> one = new ArrayList<>();
        ArrayList<Integer> two = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            ans.add(temp.val);
            temp=temp.next;

        }
        int i=0;
        while(i<ans.size()){
            int t = ans.get(i);
            one.add(t);
            i+=2;
        }

        int j=1; 
        while(j<ans.size()){
            int t = ans.get(j);
            two.add(t);
            j+=2;
        }

        ListNode dummy = new ListNode(0);
        ListNode dummy1 = dummy;
        for(int v : one){
            dummy1.next = new ListNode(v);
            dummy1=dummy1.next;
        }
        for(int v : two){
            dummy1.next = new ListNode(v);
            dummy1=dummy1.next;
        }
        return dummy.next;
        


    }
}