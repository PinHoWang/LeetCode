class Solution {
    public int missingNumber(int[] nums) {
        int max = nums.length;
        int ans = (max+1)*max / 2;
        int sum = 0;
        for(int i : nums) {
            sum += i;
        }
        return ans - sum;
    }
}
