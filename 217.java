class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums.length == 0) return false;
        
        Set<Integer> s = new HashSet<>();
        for(int i : nums) {
            if(s.contains(i)) {
                return true;
            }
            else {
                s.add(i);
            }
        }
        return false;
    }
}
