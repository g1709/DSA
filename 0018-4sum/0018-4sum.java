class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        Set<List<Integer>> answer = new HashSet<>();
        for(int i=0; i<n-2; i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            for(int j=i+1; j<n; j++){
                if(j>i+1 && nums[j]==nums[j-1]) continue;
                int k = j+1;
                int l = n-1;
                while(k<l){
                    long temp =(long) nums[i]+nums[j]+nums[k]+nums[l];
                    if(temp == target){
                        List<Integer> ans = Arrays.asList(nums[i], nums[j], nums[k], nums[l]);
                        answer.add(ans);
                        k++;
                        l--;
                    }
                    else if(temp<target){
                        k++;
                    }
                    else{
                        l--;
                    }
                }
            }
        }
        return new ArrayList<>(answer);
        
    }
}