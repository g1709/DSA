class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        HashSet<List<Integer>> set = new HashSet<>();
        for(int i=0; i<n; i++){
           
            if(i>0 && nums[i]==nums[i-1]) continue;
            int j=i+1;
            int k=n-1;
            while(j<k){
                ArrayList<Integer> temp = new ArrayList<>();
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==0){
                   temp.add(nums[i]);
                   temp.add(nums[j]);
                   temp.add(nums[k]);
                    Collections.sort(temp);
                    set.add(new ArrayList<>(temp));
                    j++;
                    k--;

                }
                else if(sum>0){
                    k--;
                }
                else{
                    j++;
                }

            }
        }
        return new ArrayList<>(set);
    }
}