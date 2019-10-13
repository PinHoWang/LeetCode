class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // BFS
        if(matrix.length == 0 || matrix[0].length == 0 || matrix == null) return false;
        
        // To mark whether element has already traverse
        boolean[][] marked = new boolean[matrix.length][matrix[0].length];
        
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0, 0});
        while(q.size() != 0) {
            int[] n = q.poll();
            
            marked[n[0]][n[1]] = true;
            if(matrix[n[0]][n[1]] == target) return true;
            
            // Need to handle larger than target?
            
            // Add neighbor into queue
            if(n[0] + 1 < matrix.length && !marked[n[0]+1][n[1]] && matrix[n[0]+1][n[1]] <= target) q.add(new int[]{n[0]+1, n[1]});
            //if(!marked[n[0]-1][n[1]]) q.add(new int[]{n[0]-1, n[1]});
            if(n[1] + 1 < matrix[0].length && !marked[n[0]][n[1]+1] && matrix[n[0]][n[1]+1] <= target) q.add(new int[]{n[0], n[1]+1});
            //if(!marked[n[0]+1][n[1]-1]) q.add(new int[]{n[0], n[1]-1});
        }
        
        return false;
    }
}
