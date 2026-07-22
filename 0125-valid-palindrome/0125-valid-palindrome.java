class Solution {
    public boolean isPalindrome(String s) {
        s=s.trim().toLowerCase().replaceAll("[^a-z0-9]", "");
        StringBuilder sb  = new StringBuilder();
        for(int i=s.length()-1; i>=0; i--){
            sb.append(s.charAt(i));
        }
        String si = sb.toString();
        if(si.equals(s)) return true;

    return false;
    }
}