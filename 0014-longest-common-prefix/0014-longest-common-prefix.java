class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        Arrays.sort(strs);
        char one[] = strs[0].toCharArray();
        char last[] = strs[n-1].toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<one.length; i++){
            if(one[i]!=last[i]){
                break;
            }
            sb.append(one[i]);
        }

        return sb.toString();
        
    }
}