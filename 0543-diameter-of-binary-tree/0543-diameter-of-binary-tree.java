/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public static int solve(TreeNode root, int arr[]){
        if(root==null) return 0;
        int left = solve(root.left, arr);
        int right = solve(root.right, arr);
        int temp = left+right;
        arr[0] = Math.max(arr[0], temp);
        return 1+Math.max(left, right);
    }


    public int diameterOfBinaryTree(TreeNode root) {
        int arr[] = {Integer.MIN_VALUE};
        solve(root, arr);
        return arr[0];
        
    }
}