class Solution {
    public int search(int[] nums, int target) {
        if(nums.length == 0 || nums == null) return -1;
        
        return helper(nums, target, 0, nums.length-1);
    }
    
    private int helper(int[] arr, int target, int first, int last) {
        if(first >= last) {
            if(arr[first] == target) return first;
            else return -1;
        }
        
        int mid = first + ((last - first) / 2);
        if(arr[mid] > target) {
            return helper(arr, target, first, mid-1);
        }
        else if(arr[mid] < target) {
            return helper(arr, target, mid+1, last);
        }
        else return mid;
    }
}
