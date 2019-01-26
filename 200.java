class Solution {
    public int numIslands(char[][] grid) {
        if(grid.length == 0) return 0;
        
        boolean[][] marked = new boolean[grid.length][grid[0].length];
        int count = 0;
        for(int i = 0; i < grid.length; i++)
        {
            for(int j = 0; j < grid[0].length; j++)
            {
                if(!marked[i][j] && grid[i][j] != '0')
                {
                    dfs(i, j, grid, marked);
                    count++;
                }
            }
        }
        
        return count;
    }
    
    private void dfs(int i, int j, char[][] grid, boolean[][] marked)
    {
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || marked[i][j]) return;
        marked[i][j] = true;
        if(grid[i][j] == '0') return;
        
        dfs(i+1, j, grid, marked);
        dfs(i-1, j, grid, marked);
        dfs(i, j+1, grid, marked);
        dfs(i, j-1, grid, marked);
    }
        
}
