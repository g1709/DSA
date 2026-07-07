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
    public ListNode reverseKGroup(ListNode head, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            ans.add(temp.val);
            temp=temp.next;
        }

        int i=0;
        int j=0;
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> answer = new ArrayList<>();
        while(i<ans.size()){
            st.push(ans.get(i));
            while(i-j+1==k){
                while(!st.isEmpty()){
                    answer.add(st.pop());
                }
            j=i+1;
            }
            i++;
        }

        while(j<ans.size()){
            answer.add(ans.get(j));
            j++;
        }
        ListNode dummy = new ListNode(0);
        ListNode dummy1 = dummy;
        for(int v : answer){
            dummy1.next = new ListNode(v);
            dummy1 = dummy1.next;
        }
        return dummy.next;
        
    }
}