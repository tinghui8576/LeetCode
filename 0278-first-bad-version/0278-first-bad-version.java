/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int s = 0;
        int e = n;
        while (e >= s){
            int id = s + (int)(e-s)/2;
            if(!isBadVersion(id)){
                s = id +1;
            }
            else{
                e = id -1;
            }
        }
        return e+1;
    }
}