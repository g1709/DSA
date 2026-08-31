class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        int arr[] = new int[2];
        for(int i=0; i<n; i++){
            int temp = target-nums[i];
            if(map.containsKey(temp)){
                arr[0]=i;
                arr[1]=map.get(temp);
                return arr;
            }
            map.put(nums[i], i);
        }
        return new int[]{-1,-1};
    }
}