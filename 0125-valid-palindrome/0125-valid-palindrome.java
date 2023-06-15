class Solution {
    public boolean isPalindrome(String s) {
        String nw ="";
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        for (int i =  s.length()-1; i >= 0; i--){
            nw = nw + s.charAt(i);
        }  
        if (nw.equals(s))
            return true;
        return false;
    }
}