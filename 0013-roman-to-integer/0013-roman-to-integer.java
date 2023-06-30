class Solution {
    public int romanToInt(String s) {
        int ans = 0;
        HashMap <Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        char[] list = s.toCharArray();
        for(int i =0; i<s.length(); i++){
            if (list[i] == 'C' && i < s.length()-1){
                if(list[i+1] == 'D'){
                    i++;
                    ans += 400;
                }
                else if(list[i+1] == 'M'){
                    i++;
                    ans += 900;
                }
                else{
                    ans += map.get(list[i]);
                }
            }
            else if (list[i] == 'X' && i < s.length()-1){
                if(list[i+1] == 'L'){
                    i++;
                    ans += 40;
                }
                else if(list[i+1] == 'C'){
                    i++;
                    ans += 90;
                }
                else{
                    ans += map.get(list[i]);
                }
            }
            else if (list[i] == 'I' && i < s.length()-1){
                if(list[i+1] == 'V'){
                    i++;
                    ans += 4;
                }
                else if(list[i+1] == 'X'){
                    i++;
                    ans += 9;
                }
                else{
                    ans += map.get(list[i]);
                }
            }
            else{
                ans += map.get(list[i]);
            }
        }
        
        
        return ans;
    }
}