class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums == null || nums.length == 0) return result;
        
        for(int i : nums) {
            List<Integer> temp = new ArrayList<>();
            Set<Integer> forbid = new HashSet<>();
            temp.add(i);
            forbid.add(i);
            helper(result, temp, forbid, nums);   
        }
        
        return result;
    }
    
    private void helper(List<List<Integer>> result, List<Integer> temp, Set<Integer> forbid, int[] nums) {
        if(temp.size() == nums.length) {
            result.add(temp);
            return;
        }
        else {
            for(int j : nums) {
                if(forbid.contains(j)) continue;
                else {
                    // temp may share the same memory address
                    List<Integer> newTemp = new ArrayList<>(temp);
                    newTemp.add(j);
                    // forbid may share the same memory address
                    Set<Integer> newForbid = new HashSet<>(forbid);
                    newForbid.add(j);
                    helper(result, newTemp, newForbid, nums);
                }
            }
        }
        
    }
}
