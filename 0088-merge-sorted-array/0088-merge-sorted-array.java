class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i<m; i++){
            ans.add(nums1[i]);
        }
        for(int v: nums2){
            ans.add(v);
        }
        
        Collections.sort(ans);
        int ptr = 0;
        for(int vi : ans){
            nums1[ptr] = vi;
            ptr++;
        }
        
    }
}