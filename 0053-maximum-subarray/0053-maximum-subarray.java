class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int sum=0;
        int maxi = nums[0];
        for(int v : nums){
            sum+=v;
            maxi = Math.max(maxi, sum);
            if(sum<0){
                sum=0;
            }
        }
    return maxi;       
    }
}