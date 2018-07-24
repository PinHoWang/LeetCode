class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        if(nums.length == 0) return new LinkedList<Integer>();
        
        for(int i : nums) {
            i = Math.abs(i);
            if(nums[i-1] > 0) {
                nums[i-1] = -nums[i-1];
            }
        }
        
        List<Integer> result = new LinkedList<Integer>();
        for(int j = 0; j < nums.length; j++) {
            if(nums[j] > 0) result.add(j+1);
        }
        
        return result;
    }
}
