class Solution {
    public static void solve(int[] nums, ArrayList<Integer> ans, List<List<Integer>> answer, int index ,boolean visited[] ){
        if(index == nums.length){
            answer.add(new ArrayList<>(ans));
            return;
        }


        for(int i=0; i<nums.length; i++){
            if(visited[i]==true) continue;
            //
            visited[i]=true;
            ans.add(nums[i]);
            solve(nums, ans, answer, index+1, visited);


            ans.remove(ans.size()-1);
            visited[i]=false;
        }


    }


    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList();
        int n = nums.length;
        boolean visited[] = new boolean[n];
        solve(nums, ans, answer, 0, visited);
        return answer;
        
    }
}