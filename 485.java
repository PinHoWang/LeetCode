class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        if(nums.length == 0) return 0;
        
        int max = 0;
        int temp = 0;
        for(int i : nums) {
            if(i == 1) {temp++;}
            else {temp = 0;}
            
            if(temp > max) max = temp;
        }
        return max;
    }
}
