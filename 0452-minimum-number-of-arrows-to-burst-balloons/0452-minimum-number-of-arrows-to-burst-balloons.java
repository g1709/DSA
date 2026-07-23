class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a,b) -> Integer.compare(a[1], b[1]));
        int count=1;
        int first = points[0][0];
        int last = points[0][1];
        for(int i=0; i<points.length; i++){
            int f = points[i][0];
            int l = points[i][1];
            if(last>=f){
                continue;
               
            }
            else {
                count++;
                last = points[i][1];
            }

        }
        return count;
    }
}