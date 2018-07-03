class Solution {
    public int maxSubArray(int[] nums) {
        int r = nums[0];
        int s = nums[0];
        
        for(int i = 1; i < nums.length; i++) {
            r = Math.max(r+nums[i], nums[i]);
            s = Math.max(s, r);
        }
        return s;
    }
}
