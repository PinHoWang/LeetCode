class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Check the row
        for(int i = 0; i < 9; i++) {
            HashSet sRow = new HashSet();
            for(int j = 0; j < 9; j++) {
                if(!sRow.add(board[i][j]) && board[i][j] != '.') return false; 
            }
        }
        
        // Check the colume
        for(int i = 0; i < 9; i++) {
            HashSet sCol = new HashSet();
            for(int j = 0; j < 9; j++) {
                if(!sCol.add(board[j][i]) && board[j][i] != '.') return false;
            }
        }
        
        // Check the sub-boxes
        for(int m = 0; m < 9; m+=3) {
            for(int n = 0; n < 9; n+=3) {
                HashSet sBox = new HashSet();
                for(int i = m; i < m+3; i++) {
                    for(int j = n; j < n+3; j++) {
                        if(!sBox.add(board[i][j]) && board[i][j] != '.') return false;
                    }
                }
            }
        }
        
        return true;            
        
    }
}
