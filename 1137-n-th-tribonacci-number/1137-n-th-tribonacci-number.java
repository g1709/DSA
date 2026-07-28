class Solution {
    static int dp[];
    public static int tribonacc(int n){
        if(n==0) return 0;
        if(n==1 || n==2) return 1;
        if(dp[n]!=0) return dp[n];
        return dp[n] =  tribonacc(n-1)+tribonacc(n-2)+tribonacc(n-3);
    }


    public int tribonacci(int n) {
        dp = new int[n+1];
        return tribonacc(n);
        
        
    }
}