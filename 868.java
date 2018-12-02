class Solution {
    public int binaryGap(int N) {
        
        int count = Integer.MIN_VALUE;
        int result = 0;
        while(N > 0) {
            if(N % 2 == 1) {
                result = Math.max(result, count); 
                count = 0;
            }
            count++;
            N = N/2;
        }
        
        return result;
    }
}
