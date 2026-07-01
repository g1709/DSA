class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0;
        int j=0;
        int maxi=0;
        ArrayList<Character> list = new ArrayList<>();
        while(i<s.length()){
            if(!list.contains(s.charAt(i))){
                list.add(s.charAt(i));
                maxi=Math.max(maxi, i-j+1);
                 i++;
            }
            else{
                list.remove(Character.valueOf(s.charAt(j)));
                j++;
            }
           
             
        }
        return maxi;
        
    }
}