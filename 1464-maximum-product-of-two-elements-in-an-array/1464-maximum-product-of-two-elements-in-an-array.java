class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int one = nums[n-1]-1;
        int two = nums[n-2]-1;
        return one*two;

        
    }
}