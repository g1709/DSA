class Solution {

 public static void reverse(int[] nums, int i, int j){

        
        while(i<j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;

        }

    }

    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int n = grid.length; //row
        int m = grid[0].length; //col
        int nums[] = new int[n*m];
        int p = nums.length;
        int idx=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                nums[idx++] = grid[i][j];
            }
        }
        k=k%p;
        reverse(nums, 0, p-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, p-1);
        int index=0;
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            ArrayList<Integer> l = new ArrayList<>();
            for(int j=0; j<m; j++){
                l.add(nums[index++]);
            }
            list.add(l);
        }
        return list;
        

        
    }
}