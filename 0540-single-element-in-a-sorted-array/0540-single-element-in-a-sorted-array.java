class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int v: nums){
            map.put(v, map.getOrDefault(v, 0)+1);
        }

        for(int v : nums){
            if(map.get(v)==1){
                return v;
            }
        }
        return -1;
        
    }
}