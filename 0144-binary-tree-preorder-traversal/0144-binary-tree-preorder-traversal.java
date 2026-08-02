class Solution {
    public static void solve(TreeNode root, ArrayList<Integer> list){
        if(root==null) return;

        list.add(root.val);
        solve(root.left, list);
        solve(root.right, list);

    }


    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        solve(root, list);
        return list;

    }
}