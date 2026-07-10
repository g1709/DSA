class Solution {
    public boolean isPalindrome(String s) {
      //  replaceAll("[^a-z0-9]", "");
        String si = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        StringBuilder sb = new StringBuilder();
        for(int i=si.length()-1; i>=0; i--){
            sb.append(si.charAt(i));
        }
        String h = sb.toString();
        if(h.equals(si)) return true;
        return false;
        
    }
}