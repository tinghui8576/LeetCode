class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap <String, List<String>> map = new HashMap<>();
        for (String s :strs){
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String ss = String.valueOf(c);
            if (!map.containsKey(ss)){
                map.put(ss, new ArrayList<>());
            }
            map.get(ss).add(s);
            
        }
        return new ArrayList<>(map.values());
    }
}