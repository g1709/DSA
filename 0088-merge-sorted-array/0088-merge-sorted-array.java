class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i<m; i++){
            ans.add(nums1[i]);
        }
        for(int i=0; i<n; i++){
            ans.add(nums2[i]);
        }

        Collections.sort(ans);
        int pointer=0;
        for(int v : ans){
            nums1[pointer++] = v;
        }
        
    }
}