class Solution {
    public int[][] matrixBlockSum(int[][] mat, int K) {
        // Brute Froce
        int n = mat.length, m = mat[0].length;
        int[][] res = new int[n][m];
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                // Calculate res[i][j] by summazing mat
                // r from i-K to i+K
                // c from j-K to j+K within validated region
                int startR = (i - K < 0) ? 0 : i-K;
                int endR = (i + K > n-1) ? n-1 : i+K;
                int startC = (j - K < 0) ? 0 : j-K;
                int endC = (j + K > m-1) ? m-1 : j+K;
                
                int sum = 0;
                for(int r = startR; r <= endR; r++) {
                    for(int c = startC; c <= endC; c++) {
                        sum += mat[r][c];
                    }
                }
                
                res[i][j] = sum;
            }
        }
        
        return res;
    }
}
