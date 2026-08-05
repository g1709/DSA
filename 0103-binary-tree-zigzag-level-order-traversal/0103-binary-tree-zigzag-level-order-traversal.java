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
    public static int height(TreeNode root){
        if(root==null) return 0;
        return 1+Math.max(height(root.left), height(root.right));
    }


    public static void solve1(TreeNode root, int n, ArrayList<Integer> ans){
        if(root==null) return;
        if(n==1){
            ans.add(root.val);
            return;
        }

        solve1(root.left, n-1, ans);
        solve1(root.right, n-1, ans);
    }

    public static void solve2(TreeNode root, int n, ArrayList<Integer> ans){
        if(root==null) return;
        if(n==1){
            ans.add(root.val);
            return;
        }
        solve2(root.right, n-1, ans);
        solve2(root.left, n-1, ans);
    }


    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> answer = new ArrayList<>();
        int level = height(root);
        for(int i=1; i<=level; i++){
            ArrayList<Integer> ans = new ArrayList<>();
            if(i%2==0) solve2(root, i, ans);
            else solve1(root, i, ans);
            if(ans.size()>0){
            answer.add(ans);
            }
        }
        return answer;
        
    }
}