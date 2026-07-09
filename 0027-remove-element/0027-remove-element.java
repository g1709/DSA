class Solution {
    public int removeElement(int[] nums, int val) {
        ArrayList<Integer> ans = new ArrayList<>();
        int pointer = 0;
        for(int v : nums){
            if(v!=val){
                ans.add(v);
            }
        }
        for(int i=0; i<ans.size(); i++){
            nums[pointer++] = ans.get(i);
        }
        return pointer;
    }
}