class Solution {
    public int search(int[] nums, int target) {
        int id = target-nums[0];
        if (id >= nums.length || -id >= nums.length)    id =0;
        else if (id < 0) id = nums.length + id; 
        int count = 0;
        for (int i = id; count < nums.length; i++){
            if( i >= nums.length)
                i = i - nums.length;
            if (nums[i] == target) return i;
            count ++;
        }
        return -1;
    }
}