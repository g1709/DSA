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

    public static void solve(TreeNode root, int targetSum, ArrayList<Integer> ans,List<List<Integer>> answer ){
        if(root==null) return;

        ans.add(root.val);
        if(root.val==targetSum && root.left==null && root.right==null){
            
            answer.add(new ArrayList<>(ans));
            ans.remove(ans.size()-1);
            return;
        
        }
        
       
        solve(root.left, targetSum-root.val, ans, answer);
        solve(root.right, targetSum-root.val, ans, answer);
         ans.remove(ans.size()-1);

    }

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> answer = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        solve(root, targetSum, ans, answer);
        return answer;
    }
}