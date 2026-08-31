class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int v : nums){
            set.add(v);
        }
        ArrayList<Integer> sett = new ArrayList<>(set);
        Collections.sort(sett);
        int pointer=0;
        for(int v : sett){
            nums[pointer++] = v;
        }
        return pointer;
        
    }
}