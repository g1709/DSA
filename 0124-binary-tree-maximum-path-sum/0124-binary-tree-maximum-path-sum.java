
class Solution {
    public static int solve(TreeNode root, int arr[]){
        if(root==null) return 0;
        int left =  Math.max(0,solve(root.left, arr));
        int right =  Math.max(0,solve(root.right, arr));
        int temp = root.val + left + right;
        arr[0] = Math.max(arr[0], temp);

        return root.val+Math.max(left, right);

    }


    public int maxPathSum(TreeNode root) {
        int arr[] =  {Integer.MIN_VALUE};
        solve(root, arr);
        return arr[0];
        
    }
}