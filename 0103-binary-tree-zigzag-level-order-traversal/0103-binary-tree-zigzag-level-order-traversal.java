
class Solution {
    public static int height(TreeNode root){
        if(root==null) return 0;
        return 1+Math.max(height(root.left), height(root.right));
    }
    public static void one(TreeNode root,  ArrayList<Integer> ans, int n){
        if(root==null) return;
        if(n==1){
            ans.add(root.val);
            return;
        }
        one(root.left, ans, n-1);
        one(root.right, ans, n-1);
    }

    public static void two(TreeNode root, ArrayList<Integer> ans, int n){
        if(root==null) return;
        if(n==1){
            ans.add(root.val);
            return;
        }
        two(root.right, ans, n-1);
        two(root.left, ans, n-1);
    }



    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> answer = new ArrayList<>();
        
        int level = height(root);
        for(int i=1; i<=level; i++){
            ArrayList<Integer> ans = new ArrayList<>();
            if(i%2==0) two(root, ans, i);
            else one(root, ans, i);
            if(ans.size()>0){
                answer.add(ans);
            }
        }
return answer;
        
    }
}