class Solution {
    public int[] sort(int[] arr){
        Arrays.sort(arr);
        return arr;
    }
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList();
        nums = sort(nums);
        int a = Integer.MAX_VALUE;
        
        int i = 0;
        while ( i < nums.length){
            
            if (nums[i] != a){
                
                int j = i +1;
                int k = nums.length -1;
                int b = Integer.MAX_VALUE;
                while ( j < k){
                    int sum = nums[i] + nums[j] + nums[k];
                    if (nums[j] != b){
                        if(sum == 0){
                            a = nums[i];
                            b = nums[j];
                            ans.add(Arrays.asList(nums[i],nums[j],nums[k]));
                            j++;
                            k = nums.length-1;
                        }
                        else if(sum > 0){
                            k --;
                        }
                        else if (sum < 0){
                            j ++;
                        }
                    }
                    else{
                        j++;
                        k = nums.length-1;
                    }
                    
                   
                }
            }
            i++;
    
        }
        return ans;
    }
}