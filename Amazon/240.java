class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0 || matrix[0][0] > target) return false;
        
        // Starting from bottom-left
        // If the element is larget than target, row -= 1
        // If the element is less than target, col += 1
        // If the index is exceed the boundary, return false
        
        int row = matrix.length - 1, col = 0;
        while(row >= 0 && col < matrix[0].length) {
            if(matrix[row][col] > target) row--;
            else if(matrix[row][col] < target) col++;
            else return true;
        }
        
        return false;
    }
}
