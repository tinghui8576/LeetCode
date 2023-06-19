class Solution {
    public int search(int[] nums, int target) {
        int s = 0;
        int e = nums.length-2;
        while (e >= s){
            int id = s + (int)(e-s)/2;
            if(target > nums[id]){
                s = id +1;
            }
            else{
                e = id -1;
            }
        }
        if (nums[e+1] == target)
            return e+1;
        else
            return -1;
    }
}