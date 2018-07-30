class Solution {
    public double findMaxAverage(int[] nums, int k) {
        if(nums.length < k) return 0;
        
        double max = 0;
        for(int i = 0; i < k; i++) {
            max += nums[i];
        }
        
        double temp = max;
        for(int j = 0; j < nums.length-k; j++) {
            temp = temp - nums[j] + nums[j+k];
            if(temp > max) max = temp;
        }
        
        return max / k;
        
    }
}
