class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int left[] = new int[n];
        int right[] = new int[n];
        int leftsum=0;
        for(int i=0; i<n; i++){
            leftsum+=nums[i];
            left[i]=leftsum;
        }
        int rightsum=0;
        for(int i=n-1; i>=0; i--){
            rightsum+=nums[i];
            right[i] = rightsum;

        }
        for(int i=0; i<n; i++){
            int l = left[i];
            int r = right[i];
            if(l==r) return i;
        }
        return -1;
    }
}