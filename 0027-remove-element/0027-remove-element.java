class Solution {
    public int removeElement(int[] nums, int val) {
        int pointer=0;
        int ans[] = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            if(nums[i]==val){
                continue;
            }
            ans[pointer++] = nums[i];
            
        }
        for(int i=0; i<ans.length; i++){
            nums[i] = ans[i];
        }
    return pointer;
    }
}