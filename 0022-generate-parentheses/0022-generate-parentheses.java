class Solution {
    public static void solve(int n, String ans ,  ArrayList<String> list ,int l, int r){
            if(r==n){
                list.add(ans);
                return;
            }


        if(l<n) solve(n, ans+'(', list, l+1, r );
        if(r<l) solve(n, ans+')', list, l, r+1);
    }

    public List<String> generateParenthesis(int n) {
        String ans = "";
        ArrayList<String> list = new ArrayList<>();
        solve(n, "", list, 0, 0);
        return list;
        
    }
}