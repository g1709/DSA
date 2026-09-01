class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum=0;
        int m = grid.length;
        int n = grid[0].length;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                int temp = grid[i][j];
                sum+=temp;
                map.put(temp, map.getOrDefault(temp, 0)+1);
            }
        }

        int size = m*n;
        int actualsum = (size*(size+1))/2;
        int answer[] = new int[2];
       // int cal = actualsum-sum();
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                int temp = grid[i][j];
                if(map.containsKey(temp)){
                if(map.get(temp)>1){
                    answer[0] = temp;
                    int cal = actualsum-(sum-temp);
                    answer[1] = cal;
                }
                }
            }
        }
       // answer[1] = cal;

        return answer;
        
    }
}