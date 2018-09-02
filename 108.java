/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0) return null;
        
        TreeNode root = helper(nums, 0, nums.length-1);
        return root;
    }
    
    private TreeNode helper(int[] nums, int left, int right) {
        if(left > right) return null;
        
        int target = (left + right) / 2;
        TreeNode node = new TreeNode(nums[target]);
        node.left = helper(nums, left, target-1);
        node.right = helper(nums, target+1, right);
        return node;
        
    }
}
