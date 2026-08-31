class Solution {
    public boolean isPalindrome(String s) {
        s=s.trim().toLowerCase().replaceAll("[^0-9a-z]", "");
        StringBuilder sb = new StringBuilder();
        for(int i=s.length()-1; i>=0; i--){
            sb.append(s.charAt(i));
        }
        String ss = sb.toString();
        if(s.equals(ss)) return true;
        return false;
        
    }
}