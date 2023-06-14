class Solution {
     public boolean containsDuplicate(int[] nums) {
        HashSet ex = new HashSet<>();
        for (int x : nums){
            if(ex.contains(x)){
                return true;
            }
            ex.add(x);
        }
        return false;
    }
}