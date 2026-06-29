class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int tar = n-k+1;
        int ans[] = new int[tar];
        int pointer=0;
        Deque<Integer> q = new LinkedList<>();
        int j=0;
        for(int i=0; i<n; i++){
            while(!q.isEmpty() && q.peekLast()<nums[i]){
                q.pollLast();
            }
            q.add(nums[i]);
            while(i-j+1>=k){
                ans[pointer++] = q.peek();
                if(nums[j]==q.peekFirst()){
                    q.pollFirst();
                }
                j++;
                

            }
        }
        return ans;
        
    }
}