class Solution {
    public int peakIndexInMountainArray(int[] A) {
        // if(A[0] > A[1]) return 0;
        // if(A[A.length-2] > A[A.length-1]) return A.length-2;
        
        int index = 0;
        for(int i = 1; i < A.length-1; i++) {
            if(A[i] > A[i-1] && A[i] > A[i+1]) {
                index = i;
            }
        }
        return index;
    }
}
