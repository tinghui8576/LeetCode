class Solution {
public int largestAltitude(int[] gain) {
        int max = 0;
        int value = 0;
        for (int h: gain){
            value = value + h;
            if(max < value)
                max = value;
        }
        return max;
    }
}