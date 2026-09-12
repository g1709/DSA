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
    public static int solve(TreeNode root, int ans[]){
        if(root==null) return 0;
        int left = Math.max(0, solve(root.left, ans));
        int right = Math.max(0, solve(root.right, ans));
        int temp = left + right +  root.val;
        ans[0] = Math.max(ans[0], temp);
        return root.val+Math.max(left, right);

    }


    public int maxPathSum(TreeNode root) {
        int ans[] = {Integer.MIN_VALUE};
        solve(root, ans);
        return ans[0];

        
    }
}