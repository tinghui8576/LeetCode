class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> t = new HashMap<>();
        int ans = 0;
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if (t.containsKey(ch)){
                int v = t.get(ch)+1;
                t.replace(ch,v);
                if(v%2 == 0){
                    ans +=2;
                }
            }
            else{
                t.put(ch, 1);
            }
        }
        if (s.length() == ans)
            return ans;
        return ans+1;
    }
}