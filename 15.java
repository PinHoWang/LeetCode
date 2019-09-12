class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums == null || nums.length == 0) return new ArrayList<>();
        
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < nums.length-2; i++) {
            int lo = i+1, hi = nums.length-1;
            if(i == 0 || nums[i] != nums[i-1]) {
                while(lo < hi) {
                    if(nums[i] + nums[lo] + nums[hi] == 0) {
                        // find it
                        result.add(Arrays.asList(nums[i], nums[lo], nums[hi]));
                        while(lo < hi && nums[lo] == nums[lo+1]) lo++;
                        while(lo < hi && nums[hi] == nums[hi-1]) hi--;
                        lo++;
                        hi--;
                    }
                    else if(nums[i] + nums[lo] + nums[hi] < 0) lo++;
                    else hi--;
                }
            }
        }
        
        return result;
    }
}
