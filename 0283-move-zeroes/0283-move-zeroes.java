class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int i=0;
        int j=0;  //handling zero
        while(i<n){
            if(nums[i]!=0){
                int temp = nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                j++;
            }
            i++;

        }
        
    }
}