class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int[][] ans = image;
        int r = image.length;
        int c = image[0].length;
        ArrayList<Integer[]> change = new ArrayList<Integer[]>();
        Integer[] id = {sr, sc};
        int co = ans[sr][sc];
        change.add(id);

        while(change.size() != 0 && color != co){
            int idr = change.get(0)[0];
            int idc = change.get(0)[1];
            ans[idr][idc] = color;
            change.remove(0);
            if (idr +1 < r){
                if (ans[idr+1][idc] == co){
                    Integer[] i = {idr+1, idc};
                    change.add(i);
                }
                
            }
            if (idc+1 <c){
                if(ans[idr][idc+1] == co){
                    Integer[] i = {idr, idc+1};
                    change.add(i);
                }
            }
            if (idr -1 >= 0){
                if(ans[idr-1][idc] == co){
                    Integer[] i = {idr-1, idc};
                    change.add(i);
                }
            }
            if (idc-1 >= 0){
                if(ans[idr][idc-1] == co){
                Integer[] i = {idr, idc-1};
                change.add(i);
            }
            }   
            

        }
        return ans;
    }
}