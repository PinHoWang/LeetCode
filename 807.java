class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        if(grid.length == 0) return 0;
        
        int count = 0;
        int[] colMax = new int[grid[0].length];
        int[] rowMax = new int[grid.length];
        
        for(int i = 0; i < grid.length; i++)
        {
            int maxC = grid[i][0];
            for(int j = 1; j < grid[0].length; j++)
            {
                if(grid[i][j] > maxC) maxC = grid[i][j];
            }
            colMax[i] = maxC;
        }
        
        for(int k = 0; k < grid[0].length; k++)
        {
            int maxR = grid[0][k];
            for(int l = 1; l < grid.length; l++)
            {
                if(grid[l][k] > maxR) maxR = grid[l][k];
            }
            rowMax[k] = maxR;
        }
        
        
        
        for(int m = 0; m < grid.length; m++)
        {
            for(int n = 0; n < grid[0].length; n++)
            {
                int less = Math.min(colMax[m], rowMax[n]);
                count += (less - grid[m][n]);
            }
        }
        
        return count;
    }
}
