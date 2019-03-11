class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        if(nums.length == 0) return new ArrayList<>();
        
        List<List<Integer>> result = new ArrayList<>();
        backTracking(result, new ArrayList<>(), nums, 0);
        
        return result;
    }
    
    private void backTracking(List<List<Integer>> result, List<Integer> temp, int[] nums, int start)
    {
        result.add(new ArrayList<>(temp));
        for(int i = start; i < nums.length; i++)
        {
            temp.add(nums[i]);
            backTracking(result, temp, nums, i+1);
            temp.remove(temp.size() - 1);
        }
    }
}
