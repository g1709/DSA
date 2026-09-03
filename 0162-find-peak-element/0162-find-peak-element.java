class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int maxi = nums[0];
        int idx=0;
        for(int i=0; i<n; i++){
            if(maxi<nums[i]){
                maxi=Math.max(maxi, nums[i]);
                idx=i;
            }

        }
        return idx;
        
    }
}