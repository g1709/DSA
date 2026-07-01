class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        for(int ch : jewels.toCharArray()){
            map.put(ch, true);
        }
        int count=0;
        for(int v : stones.toCharArray()){
            if(map.containsKey(v)) count++;
        }
    return count;       
    }
}