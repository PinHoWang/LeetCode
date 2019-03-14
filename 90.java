class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        if(nums.length == 0) return new ArrayList<>();
        
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        helper(result, new ArrayList<>(), nums, 0);
        return result;
    }
    
    private void helper(List<List<Integer>> result, List<Integer> temp, int[] nums, int pos) {
        if(!result.contains(new ArrayList<>(temp))) result.add(new ArrayList<>(temp));
        for(int i = pos; i < nums.length; i++) {
            temp.add(nums[i]);
            helper(result, temp, nums, i+1);
            temp.remove(temp.size()-1);
        }
    }
}
