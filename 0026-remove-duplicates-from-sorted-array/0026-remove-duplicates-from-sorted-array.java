class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int v : nums){
            set.add(v);
        }
        int count = set.size();
        List<Integer> lis =  new ArrayList<>(set);
        Collections.sort(lis);
        for(int i=0; i<lis.size(); i++){
            nums[i] = lis.get(i);
        }
        return count;
        
    }
}