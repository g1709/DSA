class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int mini = Integer.MAX_VALUE;
        int i=0;
        int j=0;
        int sum=0;
        while(i<n){
            sum+=nums[i];
            while(sum>=target){
                mini = Math.min(mini, i-j+1);
                sum=sum-nums[j];
                j++;
            }
            
        i++;
        }   
    return mini==Integer.MAX_VALUE? 0 : mini;
    }
}