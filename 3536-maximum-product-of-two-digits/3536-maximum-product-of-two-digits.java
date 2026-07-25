class Solution {
    public int maxProduct(int n) {
        String s = Integer.toString(n);
        int curr = s.charAt(0)-'0';
        int maxi=0;
        for(int i=0; i<s.length()-1; i++){
            int one = s.charAt(i)-'0';
            if(curr<one){
                curr = one;
            }
            
            int second = s.charAt(i+1)-'0';
            int temp = curr*second;
            maxi= Math.max(maxi, temp);
        }
    return maxi;
    }
}