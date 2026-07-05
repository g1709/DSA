class Solution {
    public static int solve(int nums[], int target, int low, int high){
        int mid = (low+high)/2;
        if(low>high) return -1;
        if(nums[mid]>target)   return solve(nums, target, low, mid-1);
        else if(nums[mid]==target) return mid;
         return solve(nums, target, mid+1, high);

    }
    public int search(int[] nums, int target) {
        return solve(nums, target, 0, nums.length-1);
        
    }
}