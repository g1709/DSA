
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null) return new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        List<List<Integer>> answer = new ArrayList<>();
        while(!q.isEmpty()){
            ArrayList<Integer> ans = new ArrayList<>();
            int size = q.size();
            for(int i=0; i<size; i++){
                TreeNode one = q.remove();
                ans.add(one.val);
                
                if(one.left!=null) q.add(one.left);
                if(one.right!=null) q.add(one.right);
            }
            answer.add(ans);
        }
        return answer;
        
    }
}