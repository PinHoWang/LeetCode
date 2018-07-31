class Solution {
    public void rotate(int[] nums, int k) {
        if(nums.length == 0 || k == 0) return;
        
        while(k > 0) {
            int temp = nums[nums.length-1];
            for(int i = nums.length-1; i >= 1; i--) {
                nums[i] = nums[i-1];
            }
            nums[0] = temp;
            k--;
        }
    }
}
