class Solution {
    public int findDuplicate(int[] nums) {
        HashSet check = new HashSet<>();
        for (int i : nums){
            if (!check.contains(i))
                check.add(i);
            else
                return i;
        }
        return 0;
    }
}