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
    public static void solve(TreeNode root, ArrayList<Integer> ans, int height){
        if(root==null) return;

        if(height==ans.size()){
            ans.add(root.val);
        }

        solve(root.right, ans, height+1);
        solve(root.left, ans, height+1);


    }


    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        solve(root, ans, 0);
        return ans;

        
    }
}