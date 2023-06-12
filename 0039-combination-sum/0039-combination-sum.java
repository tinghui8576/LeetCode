class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList();
        // Sort the array to save time
        Arrays.sort(candidates);
        // find any possibility when target = 0
        remain(candidates, target, new ArrayList<>(),ans);
        return ans;
    }
    public void remain(int[] candidates, int target, ArrayList<Integer> ar, List<List<Integer>> ans){ 
        // save the correct ans when the remain = 0
        if (target == 0){
            ans.add(new ArrayList(ar));
            return;
        }
        for(int i = 0; i< candidates.length; i++){
            // stop trying other bigger number since we sort the array
            if( target - candidates[i] < 0){
                break;
            }        
            else{
                // add the possible number into list
                ar.add(candidates[i]);
                // recursive this function 
                remain(Arrays.copyOfRange(candidates,i, candidates.length), target-candidates[i], ar, ans);
                // pop out the last number in array to check other possibility
                ar.remove(ar.size() -1);
            }
        }   
    }
}