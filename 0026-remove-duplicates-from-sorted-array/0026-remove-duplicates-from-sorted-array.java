class Solution {
    public int removeDuplicates(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();
        for(int v : nums){
            set.add(v);
        }
        
        ArrayList<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        int ptr = 0;
        for(int v : list){
            nums[ptr++] = v; 
        }
        return ptr;
    }
}