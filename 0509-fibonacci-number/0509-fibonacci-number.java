class Solution {
    public static int solve(int n){
        if(n==1 || n==2) return 1;
        if(n==0) return 0;
        return solve(n-1)+solve(n-2);
    }



    public int fib(int n) {
        int temp = solve(n);
        return temp;
       
        
    }
}