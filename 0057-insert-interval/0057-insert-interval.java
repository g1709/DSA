class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int []> answer = new ArrayList<>();
        for(int i=0; i<intervals.length; i++){
            int s = intervals[i][0];
            int e = intervals[i][1];
            answer.add(new int[]{s,e});
        }
        int f1 = newInterval[0];
        int f2 = newInterval[1];
        answer.add(new int[]{f1, f2});

        int ans[][] = answer.toArray(new int[answer.size()][]);
        List<int[]> f = new ArrayList<>();
         Arrays.sort(ans, (a,b)->a[0]-b[0]);

         int first = ans[0][0];
         int last = ans[0][1];

         for(int i=1; i<ans.length; i++){
            int firs = ans[i][0];
            int secon = ans[i][1];
            if(firs <= last){
                last = Math.max(last, secon);
            }
            else{
                f.add(new int []{first, last});
                first = firs;
                last = secon;
            }

         }
         f.add(new int[]{first, last});
         return f.toArray(new int[f.size()][]);
        
    }
}