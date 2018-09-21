class NumArray {
    private int[] arr;
    private int[] sum;
    public NumArray(int[] nums) {
        arr = nums;
        sum = new int[nums.length+1];
        fillSum(sum, arr);
    }
    
    public int sumRange(int i, int j) {
        if(i+j < 0 || i+j > 2*(arr.length-1)) return -1;
        else return sum[j+1] - sum[i];
    }
    
    private void fillSum(int[] sum, int[] nums) {
        if(nums.length == 0) return;
        
        for(int i = 1; i < sum.length; i++) {
            sum[i] = sum[i-1] + nums[i-1];
        }
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */
