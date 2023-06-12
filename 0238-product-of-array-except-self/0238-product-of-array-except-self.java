class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int total = 1;
        for (int x:nums){
            total *= x;
        }
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != 0){
                ans[i] = total/ nums[i];
            }
            else{
                ans[i] = 1;
                for (int j = 0; j < nums.length; j++){
                    
                    if (i != j){
                        ans[i] *= nums[j];
                    }
                }
            }
            
        }
        return ans;
    }
}