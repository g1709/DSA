class Solution {
    public boolean check(int[] nums) {
        
        int count=0;
        int n = nums.length;
        for(int i=0; i<n; i++){
            int id = i;
            int idx = (i+1)%n;
           
            if(nums[id] > nums[idx]){
                count++;
            } 
             if(count>1) return false;
        }
        return true;
    }
}