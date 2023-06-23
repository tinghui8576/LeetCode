class Solution {
    public  int climbStairs(int n) {
        int ans = 0;
        int[] nb = {1, 2, 0};
        for (int i = 2; i<n; i ++){
            nb[2] = nb[0]+ nb[1];
            nb[0] = nb[1];
            nb[1] = nb[2];
        }
        if (n == 1)
            return nb[0];
        else if (n==2)
            return nb[1];
        else 
            return nb[2]; 
    }
}