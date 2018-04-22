class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if(nums.length == 0) return 0;
        int count = 1;
        int c = 0;
        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i+1] - nums[i] > 0) {
                count++;
            }
            else if(nums[i+1] - nums[i] <= 0) {
                if(count > c) c = count;
                count = 1;
            } 
        }
        if(count > c) return count;
        return c;
    }
}
