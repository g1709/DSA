class Solution {
    public int removeDuplicates(int[] nums) {
        int arr[] = nums.clone();
        HashMap<Integer, Integer> map = new HashMap<>();
        int pointer=0;
        for(int i=0; i<arr.length; i++){
            int temp = arr[i];
            if(map.containsKey(temp)){
                if(map.get(temp)>=2){
                    continue;
                }
            }
                
                    nums[pointer++] = temp;
                    map.put(temp, map.getOrDefault(temp, 0)+1);
                
            
        }
        return pointer;
        
    }
}