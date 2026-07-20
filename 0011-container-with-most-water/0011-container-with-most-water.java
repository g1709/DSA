class Solution {
    public int maxArea(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int maxi=0;
        while(i<j){
            int len = j-i;
            int h = Math.min(nums[i], nums[j]);
            int ans = len*h;
            maxi=Math.max(maxi, ans);
            if(nums[i]<nums[j]){
                i++;
            }
            else if(nums[i]>nums[j]){
                j--;
            }
            else{
                i++;
            }
        }
        return maxi;
        
    }
}