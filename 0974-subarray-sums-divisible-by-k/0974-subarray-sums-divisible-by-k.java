class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int count=0;
        int sum=0;
        map.put(0, 1);
        for(int i=0; i<n; i++){
            sum+=nums[i];
            int temp = sum%k;
            if (temp < 0) temp += k;
            if(map.containsKey(temp)){
                count += map.get(temp);
            }

            map.put(temp, map.getOrDefault(temp, 0)+1);
        }
        return count;
        
    }
}