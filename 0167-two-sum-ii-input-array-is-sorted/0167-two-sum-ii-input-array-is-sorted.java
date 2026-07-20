class Solution {
    public int[] twoSum(int[] nums, int target) {
      //  Arrays.sort(nums);
        int n = nums.length;
        int ans[] = new int[2];
        int i=0;
        int j=n-1;
        while(i<j){
            int temp = nums[i]+nums[j];
            if(temp<target) i++;
            else if(temp>target) j--;
            else{
                ans[0]=i+1;
                ans[1]=j+1;
                i++;
                j--;
                break;
            }
            
        }
    return ans;
        
    }
}