class Solution {
    public int climbStairs(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        
        int[] record = new int[n+1];
        record[1] = 1;
        record[2] = 2;
        for(int i = 3; i < n+1; i++) {
            record[i] = record[i-2] + record[i-1];
        }
        
        return record[n];
    }
}
