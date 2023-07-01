class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        Arrays.sort(nums);
        rec(0, nums, l, ans);
        return ans;
    }
    public void rec(int ind, int[] nums, List<Integer> l, List<List <Integer>> ans){
        
        
        if(ind == nums.length){
            ans.add(new ArrayList<>(l));
            return;
        }
            
        l.add(nums[ind]);
        rec(ind+1, nums, l, ans);
        l.remove(l.size() -1);
        rec(ind+1, nums, l, ans);
        
    }
}