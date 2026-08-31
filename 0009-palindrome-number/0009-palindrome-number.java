class Solution {
    public boolean isPalindrome(int x) {
        boolean flag = false;
        int ans = 0;
        int dup = x;
        if(x<0){
            flag = true;
            
        }
        while(x!=0){
            int temp = x%10;
            ans = ans*10 + temp;
            x=x/10;

        }

        if(flag == true){
        ans = ans * -1;
            }

        if(ans == dup) return true;
      
        return false;
        
    }
}