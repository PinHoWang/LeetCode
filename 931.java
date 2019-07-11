class Solution {
    public int minFallingPathSum(int[][] A) {
        if(A.length == 0 || A == null) return 0;
        
        if(A.length == 1) {
            int min = Integer.MAX_VALUE;
            for(int a : A[0]) {
                min = a < min ? a : min;
            }
            return min;
        }
        
        int[][] record = new int[A.length][A[0].length];
        
        // initialize the first row of record
        record[0] = A[0];
        for(int i = 1; i < A.length; i++)
            for(int j = 0; j < A[0].length; j++) {
                List<Integer> temp = new ArrayList<>();
                
                if(j - 1 >= 0) temp.add(record[i-1][j-1] + A[i][j]);
                if(j + 1 < A[0].length) temp.add(record[i-1][j+1] + A[i][j]);
                temp.add(record[i-1][j] + A[i][j]);
                
                record[i][j] = Collections.min(temp);
            }
        
        int min = Integer.MAX_VALUE;
        for(int a : record[record.length - 1]) {
            min = a < min ? a : min;
        }
        return min;
    }
}
