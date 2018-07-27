class Solution {
    public int dominantIndex(int[] nums) {
        if(nums.length == 0) return -1;
        
        int[] max = new int[2];
        max[0] = 0;
        max[1] = nums[0];
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] > max[1]) {
                max[0] = i;
                max[1] = nums[i];
            }
        }
        
        for(int j = 0; j < nums.length; j++) {
            if(j != max[0]) {
                if(nums[j]*2 > max[1]) return -1;
            }
        }
        
        return max[0];
    }
}
