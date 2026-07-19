class Solution {
   // .replaceAll("[^a-z0-9]", "")
    public boolean isPalindrome(String s) {
       // s=s.toLowerCase().replaceAll("[^a-z0-9]","");
       s=s.toLowerCase().replaceAll("[^a-z0-9]", "");

        StringBuilder sb = new StringBuilder();
        for(int i=s.length()-1; i>=0; i--){
            sb.append(s.charAt(i));
        }
        String si = sb.toString();
        if(s.equals(si)) return true;
        return false;

        
    }
}