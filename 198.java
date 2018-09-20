class Solution {
    public int rob(int[] nums) {
        int len = nums.length;
        if(len == 0) return 0;
        if(len == 1) return nums[0];
        
        int[] dp = new int[len];
        dp[0] = nums[0];
        dp[1] = (nums[0] > nums[1]) ? nums[0] : nums[1];
        if(len == 2) return dp[1];
        for(int i = 2; i < nums.length; i++) {
            dp[i] = (dp[i-2]+nums[i] > dp[i-1]) ? dp[i-2]+nums[i] : dp[i-1];
         }    
        return dp[nums.length-1];
    }
}
