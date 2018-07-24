class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length == 0) return;
        
        int index = 0; // Tracking 
        for(int i=0; i<nums.length; i++) {
            if(nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }
        
        while(index < nums.length) {
            nums[index++] = 0;
        }
    }
}
