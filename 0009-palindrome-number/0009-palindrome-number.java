class Solution {
    public boolean isPalindrome(int x) {
        int  dup=x;
        if(x<0) return false;
        int ans=0;
        while(x!=0){
            int temp = x%10;
            ans = ans*10 + temp;
            x=x/10;
        }
        
        if(ans!=dup) return false;
        return true;
    }
}