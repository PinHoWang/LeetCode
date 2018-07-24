class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
        
        int result = nums[0];
        for(int i : nums) {
            if(!count.containsKey(i)) {
                count.put(i, 1);
            }
            else count.put(i, count.get(i)+1);
            if(count.get(i) > nums.length/2) {
                result = i;
                break;
            }
        }
        return result;
    }
}
