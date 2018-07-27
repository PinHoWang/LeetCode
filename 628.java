class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int l = nums.length;
        int rightSide = nums[l-1]*nums[l-2]*nums[l-3];
        int leftSide = nums[0]*nums[1]*nums[l-1];
        
        return (rightSide > leftSide) ? rightSide : leftSide;
    }
}
