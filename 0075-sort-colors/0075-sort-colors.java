class Solution {
    public void change(int[] nums, int i, int toi){
        int temp = nums[i];
        for (int j =i-1; j >= toi; j--){
            nums[j+1] = nums[j];
        }
        nums[toi] = temp;
        
    }
    public void sortColors(int[] nums) {
        for (int i = 1; i<nums.length; i++){
            int index = i;
            while ( nums[i] - nums[index-1] < 0){
                index --;
                if (index <= 0) {
                    break;
                }

            }
            change(nums, i, index);
            
        }
    }
}