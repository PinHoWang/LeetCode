class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        Arrays.sort(nums);
        int closest = Integer.MAX_VALUE;
        int sum = 0;
        for(int i = 0; i < nums.length-2; i++) {
            int lo = i+1, hi = nums.length - 1;
            while(lo < hi) {
                if(nums[i] + nums[lo] + nums[hi] == target) return nums[i] + nums[lo] + nums[hi];
                else {
                    if(Math.abs(target - (nums[i] + nums[lo] + nums[hi])) < closest) {
                        // find the closer one
                        sum = nums[i] + nums[lo] + nums[hi];
                        closest = Math.abs(target - (nums[i] + nums[lo] + nums[hi]));
                    }
                    if(nums[i] + nums[lo] + nums[hi] < target) lo++;
                    else hi--;
                }
            }
        }
        
        return sum;
    }
}
