class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        int maxi = Integer.MIN_VALUE;
        int n = arr.length;
        Arrays.sort(arr);
         arr[0]=1;
        for(int i=1; i<n;  i++){
           
             if(arr[i]-arr[i-1]<=1){
                maxi = Math.max(arr[i], arr[i-1]);
            }
            else if(arr[i]-arr[i-1]>1){
                arr[i] = arr[i-1]+1;
                
                if(arr[i]-arr[i-1]<=1){
                    maxi = Math.max(arr[i-1], arr[i]);
                }
            }
        }
        return maxi==Integer.MIN_VALUE?1 : maxi;
        
    }
}