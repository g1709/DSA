class Solution {
    public int numberOfSubstrings(String s) {
        int n = s.length();
        int arr[] = new int[3];
        int i=0;
        int j=0;
        int result=0;
        while(i<n){
            char ch = s.charAt(i);
            arr[ch-'a']++;
            while(arr[0]>0 && arr[1]>0 && arr[2]>0){
                result+=(n-i);
                arr[s.charAt(j)-'a']--;
                j++;
            }
            i++;
        }
    return result;
    
    }
}