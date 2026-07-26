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
    public static void solve(TreeNode root, ArrayList<Integer> list){
        if(root==null) return;
        if(root.left!=null){
        if(root.left.left==null && root.left.right==null){
            list.add(root.left.val);
        }
        }
        solve(root.left, list);
        solve(root.right, list);

    }

    public int sumOfLeftLeaves(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        int sum=0;
        solve(root, list);
        for(int i=0; i<list.size(); i++){
            sum+=list.get(i);
        }
    return sum;       
    }
}