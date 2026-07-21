class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        int j=0;
        long sum=0;
        long maxi=0;
        for(int i=0; i<n; i++){
            while(set.contains(nums[i])){
                set.remove(nums[j]);
                sum-=nums[j];
                j++;
            }
            sum+=nums[i];
            set.add(nums[i]);
            if(i-j+1>k){
                set.remove(nums[j]);
                sum=sum-nums[j];
                j++;
            }
            if(i-j+1==k){
            maxi=Math.max(maxi, sum);
            }
        }
        return maxi;
        
    }
}