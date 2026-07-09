class Solution {
    public int removeDuplicates(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int v : nums){
            if(!map.containsKey(v)){
                map.put(v, map.getOrDefault(v, 0)+1);
                ans.add(v);
            }
            else if(map.containsKey(v)){
                if(map.get(v)<2){
                    map.put(v, map.getOrDefault(v, 0)+1);
                    ans.add(v);
                }
                else{
                    continue;
                }
            }
        }

        int pointer = 0;
        Collections.sort(ans);

        for(int k : ans){
            nums[pointer++] = k;
        }
        return pointer;
    }
}