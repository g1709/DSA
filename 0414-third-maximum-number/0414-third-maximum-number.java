class Solution {
    public int thirdMax(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();
        for(int v : nums){
            set.add(v);
        }

        int arr[] = set.stream().mapToInt(Integer::intValue).toArray();

       Arrays.sort(arr);
        int n = arr.length;
        if(n<3){
            return arr[n-1];
        }
        return arr[n-3];
    }
}