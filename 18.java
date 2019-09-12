class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        /** Reduce to three sum for each element **/
        if(nums.length == 0 || nums == null) return new ArrayList<>();
        
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length-3; i++) {
            if(i == 0 || nums[i] != nums[i-1]) {
                // Three Sum
                for(int j = i+1; j < nums.length-2; j++) {
                    if(j == i+1 || nums[j] != nums[j-1]) {
                        int lo = j+1, hi = nums.length-1;
                        while(lo < hi) {
                            if(nums[i] + nums[j] + nums[lo] + nums[hi] == target) {
                                result.add(Arrays.asList(nums[i], nums[j], nums[lo], nums[hi]));
                                while(lo < hi && nums[lo] == nums[lo+1]) lo++;
                                while(lo < hi && nums[hi] == nums[hi-1]) hi--;
                                lo++;
                                hi--;
                            }
                            else if(nums[i] + nums[j] + nums[lo] + nums[hi] < target) lo++;
                            else hi--;
                        }
                    }
                }
            }
        }
        
        return result;
    }
}
