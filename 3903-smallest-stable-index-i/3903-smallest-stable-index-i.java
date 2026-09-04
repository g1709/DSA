class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int maxi = nums[0];
        
        for(int i=0; i<n; i++){
            if(maxi<nums[i]){
                maxi=nums[i];
            }
            int mini = nums[i];
            for(int j=i; j<n; j++){
                if(mini>nums[j]){
                    mini=nums[j];
                }
            }
            int temp = Math.abs(mini-maxi);
            if(temp<=k){
                return i;
            }
        }
        return -1;
    }
}