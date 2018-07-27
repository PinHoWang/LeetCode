class Solution {
    public int pivotIndex(int[] nums) {
        if(nums.length == 0) return -1;
        if(nums.length == 1) return 0;
        
        int left = 0;
        int right = 0;
        for(int i = 1; i < nums.length; i++) {
            right += nums[i];
        }
        
        for(int j = 0; j < nums.length-1; j++) {
            if(left == right) return j;
            left += nums[j];
            right -= nums[j+1];
        }
        
        if(left == right) return nums.length-1;
        return -1;
    }
}
