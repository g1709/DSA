class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length;
        int count=0;
        int i=0; 
        int j=0;
        int pro=1;
        while(i<n){
            pro*=nums[i];
            while(pro>=k  && i>=j){
                
                pro=pro/nums[j];
                j++;
            }
            count = count+(i-j+1);
            i++;
        }
        return count;
    }
}