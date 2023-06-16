class Solution {
   public int maxArea(int[] height) {
        int ll = 0;
        int rl = height.length -1;
        int l = height[ll];
        int r = height[rl];
        int max = Math.min( l,r) * (rl-ll);
        while (ll <rl){
            if( l > r){
                rl--;
                r = height[rl];
            }
            else{
                ll++;
                l = height[ll];
            }
            int a = Math.min( l,r) * (rl-ll);
            if (a > max)
                max = a;
        }
        return max;
    }
}