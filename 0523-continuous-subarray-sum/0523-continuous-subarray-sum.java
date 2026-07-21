class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int sum=0;
        for(int i=0; i<nums.length; i++){
            sum+=nums[i];
            int temp = sum%k;

            if(map.containsKey(temp)){
                int len = map.get(temp);
                //int diff = i-len;
                if(i-len>1) return true;
                
                
            }
            else{
             map.put(temp, i);
            }
           // map.put(sum, map.getOrDefault(sum, 0)+1);
        }
        return false;
    }
}