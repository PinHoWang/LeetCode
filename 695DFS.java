class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        if(grid.length == 0) return 0;

        int maxArea = 0;
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == 1) {
                    maxArea = Math.max(maxArea, dfs(grid, i, j));
                }
            }
        }
        return maxArea;
    }
    
    public int dfs(int[][] g, int x, int y) {
            if((x >= 0 && x < g.length) && (y >= 0 && y < g[0].length) && g[x][y] == 1) {
                g[x][y] = 0;
                return dfs(g, x+1, y) + dfs(g, x-1, y) + dfs(g, x, y+1) + dfs(g, x, y-1) + 1;
            }
            return 0;
        }
}
