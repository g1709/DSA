class Solution {
    public static TreeNode invert(TreeNode root){
        if(root == null) return null;   // base case

        TreeNode left = invert(root.left);
        TreeNode right = invert(root.right);

        root.left = right;
        root.right = left;

        return root;
    }

    public static boolean same(TreeNode p, TreeNode q){
        if(p == null && q == null) return true;   // dono null → same
        if(p == null || q == null) return false;  // ek null → not same
        if(p.val != q.val) return false;          // values different → not same

        return same(p.left, q.left) && same(p.right, q.right);
    }

    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;

        // invert left subtree
        TreeNode invertedLeft = invert(root.left);

        // compare inverted left with right
        return same(invertedLeft, root.right);
    }
}
