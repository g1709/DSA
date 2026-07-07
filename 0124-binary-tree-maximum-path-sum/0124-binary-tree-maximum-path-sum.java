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
    int maxi;
    public  int solve(TreeNode root){
        if(root==null) return 0;

        int left = Math.max(0, solve(root.left));
        int right = Math.max(0, solve(root.right));
        int sum = left + right + root.val;

        maxi = Math.max(maxi, sum);

        return root.val + Math.max(left, right);
    }

    public int maxPathSum(TreeNode root) {
        maxi = Integer.MIN_VALUE;
        solve(root);
        return maxi;
    }
}