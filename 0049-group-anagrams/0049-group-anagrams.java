class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String s : strs){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String si = new String(ch);
            if(!map.containsKey(si)){
                map.put(si, new ArrayList<>());
            }
            map.get(si).add(s);
        }
        return new ArrayList<>(map.values());
        
    }
}