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
    public static boolean isSymmetric(TreeNode p, TreeNode q){
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        if(p.val!=q.val) return false;
        return isSymmetric(p.left, q.right) && isSymmetric(p.right, q.left);

    }


    public static TreeNode invert(TreeNode root){
        if(root==null) return null;
        TreeNode l = root.left;
        TreeNode  r = root.right;
        root.left = invert(l);
        root.right = invert(r);

        return root;
    }


    public boolean isSymmetric(TreeNode root) {
        root.left = invert(root.left);
        return isSymmetric(root.left, root.right);

        
    }
}