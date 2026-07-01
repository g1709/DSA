class Solution {
    public int longestOnes(int[] nums, int k) {
        int i=0;
        int j=0;
       int zero=0;
        int maxi=0;
        int n = nums.length;
        
        while(i<n){
          if(nums[i]==0){
            zero++;
          }
            while(zero>k){
                if(nums[j]==0){
                    zero--;
                   
                    
                }
                j++;
            }
             i++;
            maxi=Math.max(maxi, i-j);
           

        }
        return maxi;
    }
}