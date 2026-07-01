class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int v : nums1){
            map.put(v, map.getOrDefault(v, 0)+1);
        }

        HashSet<Integer> ans = new HashSet<>();
        for(int i=0; i<nums2.length; i++){
            if(map.containsKey(nums2[i])){
                ans.add(nums2[i]);
            }
        }
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
}