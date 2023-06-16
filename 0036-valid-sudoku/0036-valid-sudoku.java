class Solution {
    public boolean isValidSudoku(char[][] board) {
        int len = board.length;
        
        for (int i = 0; i < len; i++){
            HashSet numc = new HashSet<>();
            HashSet numr = new HashSet<>();
            for (int j = 0; j< len; j++){
                if (board[j][i] != '.'){
                    if (!numc.contains(board[j][i]))
                        numc.add(board[j][i]);
                    else 
                        return false;
                } 
                if (board[i][j] != '.'){
                    if (!numr.contains(board[i][j]))
                        numr.add(board[i][j]);
                    else 
                        return false;
                }     
            }
        }
        for (int i = 0; i< len; i += 3){
            for (int j =0; j<len; j+=3){
                HashSet num = new HashSet<>();
                for (int idx = i; idx <i+3; idx++){
                    for (int idy = j; idy <j+3; idy++){
                        if (board[idx][idy] != '.'){
                            if (!num.contains(board[idx][idy]))
                                num.add(board[idx][idy]);
                            else 
                                return false;
                        } 
                    }
                }
            }
        }
        return true; 
    }
}