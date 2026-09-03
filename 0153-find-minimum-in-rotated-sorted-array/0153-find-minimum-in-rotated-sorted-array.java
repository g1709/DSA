class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int mini = nums[0];
        for(int i=0; i<n; i++){
            mini = Math.min(mini, nums[i]);
        }
        return mini;
    }
}