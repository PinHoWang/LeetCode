class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        if(nums.length == 0) return new ArrayList<>();
        
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        helper(result, new ArrayList<>(), nums, 0);
        return result;
    }
    
    private void helper(List<List<Integer>> result, List<Integer> temp, int[] nums, int pos) {
        result.add(new ArrayList<>(temp));
        int i = pos;
        while(i < nums.length) {
            temp.add(nums[i]);
            helper(result, temp, nums, i+1);
            temp.remove(temp.size()-1);
            i++;
            while(i < nums.length && nums[i] == nums[i-1]) i++;
        }
    }
}
