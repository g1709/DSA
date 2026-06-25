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
    public boolean isPalindrome(ListNode head) {
        ListNode temp = head;
        int count=0;
        ArrayList<Integer> ans = new ArrayList<>();
        while(temp!=null){
            ans.add(temp.val);
            temp=temp.next;
            count++;
        }

        int arr[] = new int[count];
        int ptr=0;
        for(int v : ans){
            arr[ptr++] = v;
        }

        int i=0; 
        int j=arr.length-1;
        while(i<j){
            if(arr[i]!=arr[j]){
              return false;
            }
            i++;
            j--;
        }
        
        return true;
        
    }
}