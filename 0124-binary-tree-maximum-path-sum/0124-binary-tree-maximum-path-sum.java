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
    public static int solve(TreeNode root, int maxi[]){
        if(root==null) return 0;
        int left = Math.max(0, solve(root.left, maxi));
        int right =  Math.max(0, solve(root.right, maxi));
        int sum = left + right + root.val;
        maxi[0] = Math.max(maxi[0], sum);

        return root.val+Math.max(left, right);

    }

    public int maxPathSum(TreeNode root) {
        int[] maxi = {Integer.MIN_VALUE};
        if(root==null) return 0;
        solve(root, maxi);
        return maxi[0];

        
    }
}