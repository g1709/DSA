class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int v : nums){
            map.put(v, map.getOrDefault(v, 0)+1);
        }
        for(int k: nums){
            if(map.containsKey(k)){
                int temp = map.get(k);
                if(temp == 1) return k;
            }
        }
        
        return -1;
    }
}