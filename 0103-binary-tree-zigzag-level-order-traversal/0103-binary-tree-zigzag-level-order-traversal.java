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


    public static void solvez1(TreeNode root, ArrayList<Integer> ans, int n){
        if(root==null) return;
        if(n==1){
            ans.add(root.val);
            return;
        }
        solvez1(root.left, ans, n-1);
        solvez1(root.right, ans, n-1);

    }
    public static void solvez2(TreeNode root, ArrayList<Integer> ans, int n){
        if(root==null) return;
        if(n==1){
            ans.add(root.val);
            return;
        }
        solvez2(root.right, ans, n-1);
        solvez2(root.left, ans, n-1);

    }


    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> answer = new ArrayList<>();
        
        int level = height(root);
        for(int i=1; i<=level; i++){
            ArrayList<Integer> ans = new ArrayList<>();
            if(i%2==0) solvez2(root, ans, i);
            else solvez1(root, ans, i);
            if(ans.size()>0){
                answer.add(ans);
            }
        }
        return answer;
    }
}