class Solution {
    public int thirdMax(int[] nums) {
        if(nums.length == 1) return nums[0];
        
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
        int flag = 0;
        
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > max1) max1 = nums[i];
        }
        
        for(int j = 0; j < nums.length; j++) {
            if(nums[j] > max2 && nums[j] < max1) {
                max2 = nums[j];
            }
        }
        
        for(int k = 0; k < nums.length; k++) {
            if(nums[k] >= max3 && nums[k] < max2) {
                flag = 1;
                max3 = nums[k];
            }
        }
        
        if(max3 == Integer.MIN_VALUE && flag == 0) {
            return max1;
        }
        else return max3;
    }
}
