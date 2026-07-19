class Solution {
    public boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        int  i=0;
        int j=s.length()-1;
        while(i<j){
        if(s.charAt(i)-'0'!=s.charAt(j)-'0') return false;
        else{
            i++;
            j--;
        }
        
        
        }
        
            
        
        return true;
        
    }
}