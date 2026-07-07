class Solution {
    public long sumAndMultiply(int n) {
        if(n==0) return 0;
        String s = Integer.toString(n);
        int sum=0;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            int val = s.charAt(i)-'0';
            if(val!=0){
                sum+=val;
                sb.append(val);
            }
        }

        String si = sb.toString();

        int x = Integer.parseInt(si);


        long answer = (long) sum*x;
        return answer;
        
    }
}