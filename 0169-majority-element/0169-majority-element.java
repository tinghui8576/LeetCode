class Solution {
    public int majorityElement(int[] nums) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int x: nums){
            if(map.containsKey(x)){
                int v = map.get(x);
                if(v > nums.length/2)
                    return x;
                map.replace(x,  v+1);
            }
            else{
                map.put(x, 1);
            }
        }
        
        return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}