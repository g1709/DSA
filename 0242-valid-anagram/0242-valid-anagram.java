class Solution {
    public boolean isAnagram(String s, String t) {
        ArrayList<Character> one = new ArrayList<>();
        ArrayList<Character> two = new ArrayList<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            one.add(ch);
        }
        for(int i=0; i<t.length(); i++){
            char ch = t.charAt(i);
            two.add(ch);

        }
        Collections.sort(one);
        Collections.sort(two);
        if(one.equals(two)){
            return true;
        }
        return false;
    }
}