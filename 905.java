class Solution {
    public int[] sortArrayByParity(int[] A) {
        int pos = 0;
        for(int i = 0; i < A.length; i++) {
            if(A[i] % 2 == 0) {
                swap(A, pos, i);
                pos++;
            }
        }
        return A;
    }
    
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
