class Solution {
    public static void reverse(int[] nums, int k, int i, int j){
        while(i<j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }


    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k=k%n;
        reverse(nums, k, 0, nums.length-1);
        reverse(nums, k, 0, k-1);
        reverse(nums, k, k, nums.length-1);
        
    }
}