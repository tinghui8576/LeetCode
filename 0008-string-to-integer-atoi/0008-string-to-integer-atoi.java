class Solution {
    public int myAtoi(String s) {
        s=s.strip();
        double ans = 0;
        boolean flag = false;
        int id = 0;
        
        for (int i = 0; i <s.length(); i++){
            char t = s.charAt(i);
            if (i == 0 && s.charAt(i) == '-'){
                flag = true;
            }
            else if (i == 0 && s.charAt(i) == '+'){
                continue;
            }
            else if (t >'9' || t < '0') break;
            else {
                ans = (t- '0' ) + ans * 10;
            }
                
        }
        if (flag == true) ans=-ans;
        
        return (int)ans;
    }
}