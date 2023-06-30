class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        int num = 0;
        HashMap<Character, Integer> map = new HashMap();
        char[] list = s.toCharArray();
        for(int i =0; i<s.length();i++){
            if(!map.containsKey(list[i])){
                map.put(list[i],i);
                num++;
            }
            else{
                if(num > ans)
                    ans = num;
                i = map.get(list[i]);
                
                map.clear();
                num = 0;
            }
        }
        if(num > ans)
                ans = num;
        return ans;
    }
}