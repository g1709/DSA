class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        
        for(int i=0; i<n-2; i++){
            
            int sum=0;
            int j=i+1;
            int k=n-1;
            while(j<k){
             sum= nums[i]+nums[j]+nums[k];
             if(sum==0){
                List<Integer> ans = Arrays.asList(nums[i], nums[j], nums[k]);
             //   Collections.sort(ans);
                set.add(ans);
                
                j++;
                k--;
             }
             else if(sum<0){
                j++;
             }
             else{
                k--;
             }
            // Collections.sort(ans);
            // set.add(ans);
            }
        }
        return new ArrayList<>(set);
    }
}