//approach phle 0 se n-1 tk reverse
//phir 0 se k-1 tk
//phir k se nums.length-1 tk
class Solution {
    public static void reverse(int[] nums, int i, int j){

        
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
        if(k>n) return;
        reverse(nums, 0, n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);
        
    }
}