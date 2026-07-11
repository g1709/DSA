class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int ans[] = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        //map.put(0,1);
        for(int i=0; i<numbers.length; i++){
            int temp = target-numbers[i];
            if(map.containsKey(temp)){
                
                ans[0]=map.get(temp)+1;
                ans[1]=i+1;
            }
            map.put(numbers[i], i);
        }
        return ans;
        
    }
}