class Solution {
    public int findUnsortedSubarray(int[] nums) {
        if(nums.length < 2) return 0;
        
        int[] sorted = new int[nums.length];
        System.arraycopy(nums, 0, sorted, 0, nums.length);
        Arrays.sort(sorted);
        
        int begin = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != sorted[i]) {
                begin = i;
                break;
            }
        }
        
        if(begin == Integer.MIN_VALUE) {
            return 0;
        }
        
        int end = nums.length-1;
        for(int j = nums.length-1; j >= 0; j--) {
            if(nums[j] != sorted[j]) {
                end = j;
                break;
            }
        }

        return end - begin + 1;
    }
}
