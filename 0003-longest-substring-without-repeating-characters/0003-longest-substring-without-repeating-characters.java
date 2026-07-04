class Solution {
    public int lengthOfLongestSubstring(String s) {
        ArrayList<Character> list = new ArrayList<>();
        int maxi=0;
        int n = s.length();
        int i=0;
        int j=0;
        while(i<n){
            char ch = s.charAt(i);;
        while(list.contains(ch)){
            list.remove(Character.valueOf(s.charAt(j)));
            j++;
        }
        i++;
        list.add(ch);
        maxi=Math.max(maxi, i-j);
        }
        return maxi;

    }
}