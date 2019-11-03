class Solution {
    private boolean[][] visited;
    
    public boolean exist(char[][] board, String word) {
        if(board == null || board.length == 0) return false;
        
        int M = board.length, N = board[0].length;
        char[] target = word.toCharArray();
        visited = new boolean[M][N];
        for(int i = 0; i < M; i++) {
            for(int j = 0; j < N; j++) {
                if(board[i][j] == target[0] && dfs(board, target, i, j, 0, visited)) return true;
            }
        }
        
        return false;
    }
    
    private boolean dfs(char[][] board, char[] target, int i, int j, int n, boolean[][] visited) {
        if(i > board.length-1 || i < 0 || j > board[0].length-1 || j < 0 || visited[i][j] || board[i][j] != target[n]) return false;
      
        visited[i][j] = true;
        if(n == target.length-1 && board[i][j] == target[n]) return true;
        
        
        boolean res = (dfs(board, target, i+1, j, n+1, visited) || dfs(board, target, i-1, j, n+1, visited)
                   || dfs(board, target, i, j+1, n+1, visited) || dfs(board, target, i, j-1, n+1, visited));
        
        // Backtracking
        visited[i][j] = false;
        return res;
    }
}
