class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        for(int i=0;i<nums.length;i++){    //length is the property of the array  
            for(int j=i+1;j<nums.length;j++){    //length is the property of the array  
                if (nums[i] + nums[j] == target){
                    int[] ans = {i, j};
                    return ans;
                }
                
            }
        }  
        return null;
    }
}