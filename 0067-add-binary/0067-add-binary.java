class Solution {
     public String addBinary(String a, String b) {
        StringBuilder ans = new StringBuilder();
        int l = 0;
        int i = a.length()-1;
        int j = b.length()-1;
        while(i >= 0 || j >= 0 || l == 1){
            if( i >= 0){
                l += a.charAt(i) - '0';
            }
            if( j >= 0){
                l += b.charAt(j) - '0';
            }
            i -= 1;
            j -= 1;
            
            ans.insert(0, l%2);
            //System.out.print(ans);
            l /= 2;
        }
        return ans.toString();
    }
}