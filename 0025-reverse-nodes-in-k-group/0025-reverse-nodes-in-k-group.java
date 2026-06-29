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
        ArrayList<Integer> answer = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        ListNode temp = head;
        while(temp!=null){
            answer.add(temp.val);
            temp=temp.next;
        }
        int n = answer.size();
        int i=0;
        int j=0;
        ArrayList<Integer> result = new ArrayList<>();
        while(i<n){
            st.push(answer.get(i));
            while(i-j+1==k){
                
                while(!st.isEmpty()){
                    
                    result.add(st.pop());
                }
                j=i+1;
            
            }
        i++;
        }
        ArrayList<Integer> faltu = new ArrayList<>();
        while(!st.isEmpty()){
            faltu.add(st.remove(0));
        }
        while(!st.isEmpty()){
        result.add(st.remove(0));   
        }
        for(int l=0; l<faltu.size(); l++){
            result.add(faltu.get(l));
        }
        ListNode dummy = new ListNode(0);
        ListNode dummy1 = dummy;
        for(int ans : result){
            dummy1.next = new ListNode(ans);
            dummy1=dummy1.next;
        }
        return dummy.next;
        
        
    }
}