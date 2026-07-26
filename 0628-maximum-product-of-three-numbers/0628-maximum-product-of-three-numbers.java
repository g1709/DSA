class Solution {
    public int maximumProduct(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int one=nums[n-1];
        int two=nums[n-2];
        int three=nums[n-3];
        int pro1=one*two*three;
        int pro2=nums[0]*nums[1]*nums[n-1];
        return Math.max(pro1, pro2);
    }
}