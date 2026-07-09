class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int v : nums){
            set.add(v);
        }
        ArrayList<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        int pointer = 0;
        for(int k : list){
            nums[pointer++] = k; 
        }
        return pointer;
        
    }
}