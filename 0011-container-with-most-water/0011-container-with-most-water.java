class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int i=0;
        int j=n-1;
        int maxi=0;
        while(i<j){
            int length = j-i;
            int h = Math.min(height[i], height[j]);
            int ans = length*h;
            maxi=Math.max(maxi, ans);

            if(height[i]<height[j]){
                i++;
            }
             else if(height[i]==height[j]){
                i++;
            }
            else if(height[i]>height[j]){
                j--;
            }
        }
        return maxi;
        
    }
}