class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int i=0;
        int j=0;
        int size=n-k+1;
        int ans[] = new int[size];
        int pnt=0;
        Deque<Integer> q = new LinkedList<>();
        while(i<n){
            while(!q.isEmpty() && q.peekLast()<nums[i]){
                q.pollLast();
                
            }
            q.add(nums[i]);
           
           
            while(i-j+1==k){
               
                ans[pnt++]=q.peek();
                
                if(nums[j]==q.peekFirst()){
                    q.pollFirst();
                }
                j++;
            }
        i++;
        }
        return ans;
    }
}