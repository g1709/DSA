class Solution {
    public void moveZeroes(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=0){
                ans.add(nums[i]);
            }
        }
        int size = nums.length-ans.size();
        int ptr = 0;
        for(int v : ans){
            nums[ptr++]=v;
        }
        for(int i=0; i<size; i++){
            nums[ptr++]=0;
        }
    }
}