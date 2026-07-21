class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int j=0;
        int maxi=0;
        HashSet<Character> set = new HashSet<>();
        for(int i=0; i<n; i++){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(j));
                j++;
            }
            set.add(s.charAt(i));
           
                maxi=Math.max(maxi, i-j+1);
            
        }
        return maxi;
    }
}