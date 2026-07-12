class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        int temp[] = arr.clone();
        Arrays.sort(temp);
        HashMap<Integer, Integer> map = new HashMap<>();
        int rank=1;
        for(int i=0; i<n; i++){
            if(map.containsKey(temp[i])) continue;
            map.put(temp[i], rank);
            rank++;
            
        }
        int ans[] = new int[n];
        for(int i=0; i<n; i++){
            if(map.containsKey(arr[i])){
                ans[i] = map.get(arr[i]);
            }
        }
        return ans;
        
    }
}

//hashmap lo index 1 se start kro fir dubara arr pe loop chalo aur hashmap pe contains hai toh uski key le lo;