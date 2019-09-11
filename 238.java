class Solution {
    public int[] productExceptSelf(int[] nums) {
        // O(n): Traverse through array once
        int countZero = 0;
        for(int n : nums)
            if(n == 0) countZero++;
        
        if(countZero > 1) {
            for(int i = 0; i < nums.length; i++) nums[i] = 0;
        }
        else {
            int product = 1;
            for(int j : nums)
                if(j != 0) product *= j;
            
            if(countZero == 1) {
                for(int k = 0; k < nums.length; k++) {
                if(nums[k] == 0) nums[k] = product;
                else nums[k] = 0;
                }
            }
            else {
                for(int l = 0; l < nums.length; l++) {
                    nums[l] = product / nums[l];
                }
            }
        }
        
        return nums;
    }
}
