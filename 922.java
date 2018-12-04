class Solution {
    public int[] sortArrayByParityII(int[] A) {
        if(A.length == 0) return A;
        
        
        // Brute Force, O(N^2)
        /*
        for(int i = 0; i < A.length; i+=2) {
            if(A[i] % 2 != 0) {
                for(int j = i+1; j < A.length; j++) {
                    if(A[j] % 2 == 0) {
                        swap(A, i, j);
                        break;
                    }
                }
            }
        }
        
        for(int k = 1; k < A.length; k+=2) {
            if(A[k] % 2 == 0) {
                for(int l = k+1; l < A.length; l++) {
                    if(A[l] % 2 != 0) {
                        swap(A, k, l);
                        break;
                    }
                }
            }
        }
        
        */
        
        
        
        return A;
    }
    
    private void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
