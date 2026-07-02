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
    public static void solve(TreeNode root, ArrayList<String> ans,  String s){
        if(root==null) return;
        if(root.left==null && root.right==null){
            s+=root.val;
            ans.add(s);
            return;
        }
        solve(root.left, ans, s+root.val+"->");
        solve(root.right, ans, s+root.val+"->");
        

    }


    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> ans = new ArrayList<>();
         solve(root, ans, "");
         return ans;
        
        
    }
}