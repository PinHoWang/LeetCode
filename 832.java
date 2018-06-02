class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        for(int i = 0; i < A.length; i++) {
            int rowLength = A[i].length;
            int middle;
            if(rowLength % 2 == 0) {
                middle = rowLength / 2;
            }
            else {
                middle = rowLength/2 + 1;
            }
            for(int j = 0; j < middle; j++) {
                int temp = (A[i][j] ^ 1);
                A[i][j] = (A[i][rowLength - j - 1] ^ 1);
                A[i][rowLength - j - 1] = temp;
            }
        }
        return A;
    }
}
