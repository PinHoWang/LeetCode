class Solution {
    // Just swap back to OG array
    public List<List<Integer>> permute(int[] nums) {
        if(nums.length == 0) return new ArrayList<>();
        
        // Need the couples variables to the backtrack funciton:
        // 1. result
        // 2. currently index
        List<List<Integer>> result = new ArrayList<>();
        backtrack(0, result, nums);
        return result;
    }
    
    private void backtrack(int curIdx, List<List<Integer>> result, int[] nums) {
        if(curIdx == nums.length) {
            List<Integer> ls = new ArrayList<>();
            for(int n : nums) ls.add(n);
            result.add(ls);
        }
        
        for(int i = curIdx; i < nums.length; i++) {
            swap(nums, curIdx, i);
            backtrack(curIdx+1, result, nums);
            swap(nums, curIdx, i); // We have to swap back to original array, to keep going later process
        }
    }
    
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
