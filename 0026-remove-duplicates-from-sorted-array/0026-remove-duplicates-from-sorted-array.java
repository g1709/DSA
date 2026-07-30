class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
        }
       
        ArrayList<Integer> list = new ArrayList<>(set);
         Collections.sort(list);
        int pointe=0;
        for(int v : list){
            nums[pointe++] = v;
        }
        return pointe;
        
    }
}