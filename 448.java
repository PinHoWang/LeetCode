class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        if(nums.length == 0) return new LinkedList<Integer>();
        
        boolean[] position = new boolean[nums.length];
        for(int j : nums) {
            position[j-1] = true;
        }
        
        List<Integer> result = new LinkedList<Integer>();
        for(int k = 0; k < nums.length; k++) {
            if(position[k] == false) result.add(k+1);
        }
        
        return result;
    }
}
