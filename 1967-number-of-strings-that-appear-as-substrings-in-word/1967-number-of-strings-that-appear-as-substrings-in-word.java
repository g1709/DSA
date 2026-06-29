class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count=0;
        for(String demo : patterns){
            if(word.contains(demo)){
                count++;
            }
        }
        return count;
    }
}