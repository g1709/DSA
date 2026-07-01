class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int sum=0;
        int count=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
      
        for(int v : nums){
            sum+=v;
            int temp = sum-k;
            if(map.containsKey(temp)){
                count+=map.get(temp);
            }
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }
    return count;
        
    }
}