class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if(r*c != nums.length*nums[0].length) return nums;
        
        int[][] reshape = new int[r][c];
        ArrayList<Integer> ls = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums[0].length; j++) {
                ls.add(nums[i][j]);
            }
        }
        
        int count = 0;
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                reshape[i][j] = ls.get(count);
                count++;
            }
        }
        
        return reshape;
    }
}
