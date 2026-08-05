
class Solution {
    public static int solve(TreeNode root, int maxi[]){
        if(root==null) return 0;

        int left = Math.max(0, solve(root.left, maxi));
        int right = Math.max(0, solve(root.right, maxi));
        int temp = root.val+left+right;
        maxi[0] = Math.max(maxi[0], temp);

        return root.val+Math.max(left, right);

    }


    public int maxPathSum(TreeNode root) {
        int maxi[] = {Integer.MIN_VALUE};
        solve(root, maxi);
        return maxi[0];
        
    }
}