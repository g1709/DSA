class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int  count=0;
        for(int i=0; i<nums.length; i++){
            int idx1 = i%n;
            int idx2 = (i+1)%n;
            
            if(nums[idx1]>nums[idx2]) count++;
            if(count>1) return false;

        }
    return true;
    }
}