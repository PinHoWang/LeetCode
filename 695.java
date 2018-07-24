class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        if(grid.length == 0) return 0;
        
        ArrayDeque<int[]> queue = new ArrayDeque<int[]>();
        int m = grid.length;
        int n = grid[0].length;
        int maxArea = 0;
        int currentArea = 0;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(grid[i][j] == 1) {
                    currentArea = 0;
                    queue.add(new int[]{i, j});
                    grid[i][j] = 0;
                    
                    while(!queue.isEmpty()) {
                        int[] e = queue.remove();
                        int x = e[0];
                        int y = e[1];
                        currentArea++;
                        
                        for(int nextX = x-1; nextX <= x+1; nextX+=2) {
                            for(int nextY = y-1; nextY <= y+1; nextY+=2) {
                                if((nextX > 0 && nextX < m) && (nextY > 0 && nextY < n)) {
                                    queue.add(new int[]{nextX, nextY});
                                    grid[nextX][nextY] = 0;
                                }
                            }
                        }
                    }
                }
                
                maxArea = Math.max(maxArea, currentArea);
            }
        }
        return maxArea;
    }
}
