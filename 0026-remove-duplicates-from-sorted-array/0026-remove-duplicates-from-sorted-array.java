class Solution {
    public int removeDuplicates(int[] nums) {
     
        HashSet<Integer> set = new HashSet<>();
        for(int v : nums){
            set.add(v);
        }
        ArrayList<Integer> ans = new ArrayList<>(set);
        Collections.sort(ans);
        int pointer=0;
        for(int k : ans){
            nums[pointer++] = k;
        }
        return pointer;
    }
}