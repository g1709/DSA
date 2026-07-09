class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int left[] = new int[n];
        int leftpro = 1;
        Arrays.fill(left, 1);
        for(int i=1; i<n; i++){
            leftpro = leftpro*nums[i-1];
            left[i] = leftpro;
        }
        int right[] = new int[n];
        int rightpro=1;
        Arrays.fill(right, 1);
        for(int i=n-2; i>=0; i-- ){
            rightpro = rightpro*nums[i+1];
            right[i] = rightpro;
        }

        int ans[] = new int[n];
        for(int i=0; i<n; i++){
            ans[i] = left[i]*right[i];
        }
        return ans;
    }
}