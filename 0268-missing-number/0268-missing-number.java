class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int v : nums){
            sum+=v;
        }
        int temp = n*(n+1)/2;
        int ans = Math.abs(sum-temp);
        return ans;


    }
}