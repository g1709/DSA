class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        int sum=0;
        
        int arr[] = new int[2];
        for(int i=0; i<n; i++){
            int tar = target-nums[i];
           
            if(map.containsKey(tar)){
                arr[0]=map.get(tar);
                arr[1]=i;
                return arr;

            }
            map.put(nums[i],i);
        }
        return arr;
        
    }
}