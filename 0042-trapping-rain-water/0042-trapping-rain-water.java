class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int left[] = new int[n];
        int right[] = new int[n];
        int leftmax = height[0];
        for(int i=0; i<n; i++){
            if(leftmax<height[i]){
                leftmax=height[i];
            }
            left[i]=leftmax;
        }
        int rightmax = height[n-1];
        for(int j=n-1; j>=0; j--){
            if(rightmax<height[j]){
                rightmax= height[j];
            }
            right[j] = rightmax;
        }
        int water=0;
        for(int i=0; i<n; i++){
            int mini = Math.min(left[i], right[i]);
            int temp = Math.abs(mini-height[i]);
            water+=temp;
        }
        return water;
    }
}