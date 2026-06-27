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
    public ListNode rotateRight(ListNode head, int k) {
        int count=0;
        ArrayList<Integer> ans = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            ans.add(temp.val);
            count++;
            temp=temp.next;
        }
        int arr[] = new int[count];
       for(int i=0; i<ans.size(); i++){
        arr[(i+k)%count] = ans.get(i);
        }

        ArrayList<Integer> fina = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            int t = arr[i];
            fina.add(t);
        }

        ListNode dummy = new ListNode(0);
        ListNode dummy1 = dummy;
        for(int v : fina){
            dummy1.next = new ListNode(v);
            dummy1=dummy1.next;
        }
        return dummy.next;
    }
}