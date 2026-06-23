class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int cap=k;
        int i=0;
        int j=0;
        int len=0;
        while(i<n){
            if(nums[i]==0){
                cap--;
            }
            while(cap<0){
                if(nums[j]==0){
                    cap++;
                }
                j++;
            }
            len=Math.max(len, i-j+1);
            i++;
        }
        return len;
        
    }
}