
class Solution {
    int maxi = Integer.MIN_VALUE;
    public  int solve(TreeNode root){
        if(root==null) return 0;
        int left = Math.max(0, solve(root.left));
        int right = Math.max(0, solve(root.right));
        int ans = root.val + left + right;
        maxi = Math.max(maxi, ans);
        return root.val + Math.max(left, right);


    }


    public int maxPathSum(TreeNode root) {
        
        solve(root);
        return maxi;
        
    }
}