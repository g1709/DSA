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
        ArrayList<Integer> ans =  new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            ans.add(temp.val);
            temp=temp.next;
        }

        ArrayList<Integer> first = new ArrayList<>();
        ArrayList<Integer> second = new ArrayList<>();

        for(int i=0; i<ans.size(); i++){
            if(i%2==0){
                first.add(ans.get(i));
            }
            else{
                second.add(ans.get(i));
            }
        }

        ListNode dummy1 = new ListNode(0);
        ListNode dummy2 = dummy1;
        for(int v : first){
            dummy2.next = new ListNode(v);
            dummy2=dummy2.next;
        }
        for(int v : second){
            dummy2.next = new ListNode(v);
            dummy2=dummy2.next;
        }
        return dummy1.next;

        
    }
}