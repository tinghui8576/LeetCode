class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        
        int c =0;
        int r= 0;
        int lc = matrix[0].length-1;
        int lr = matrix.length-1;
        int fc = 0;
        int fr = 0;
        char po = 'r';
        while(fc <= lc && fr <= lr){
            
            if (po == 'r'){
                ans.add(matrix[r][c]);
                c++;
                if(c > lc){
                    c = lc;
                    r++;
                    fr++;
                    po = 'd';
                }
            }
            else if (po == 'd'){
                ans.add(matrix[r][c]);
                r++;
                if(r > lr){
                    r = lr;
                    c--;
                    lc--;
                    po = 'l';
                }
            }
            else if (po == 'l'){
                ans.add(matrix[r][c]);
                c--;
                if(c < fc){
                    c = fc;
                    r--;
                    lr--;
                    po = 'u';
                }
            }
            else {
                ans.add(matrix[r][c]);
                r--;
                if(r < fr){
                    r = fr;
                    c++;
                    fc++;
                    po = 'r';
                }
            }
        }
        return ans;
    }
}