class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sum = 0;
        for (int i = 0; i < gas.length; i++){
            gas[i] = gas[i] - cost[i];
            sum = gas[i] + sum;
        }
        if (sum < 0 )
            return -1;
        sum = 0;
        int count = 0;
        int index = 0;
        while(count < gas.length){
            int p = index+count;
            if(p >= gas.length)
                p -= gas.length;
            if (sum >= 0){
                sum = gas[p] + sum;
                count++;
            }
            else {
                sum = sum - gas[index];
                count --;
                index++;
            }
        }
        return index;
    }
}