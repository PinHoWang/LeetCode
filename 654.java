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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if(nums.length == 0) return null;
        
        int target = findMax(nums, 0, nums.length-1);
        TreeNode root = new TreeNode(nums[target]);
        root.left = partition(nums, 0, target-1);
        root.right = partition(nums, target+1, nums.length-1);
        
        return root;
    }
    
    private TreeNode partition(int[] nums, int L, int R) {
        if(L > R) return null;
        
        int target = findMax(nums, L, R);
        TreeNode n = new TreeNode(nums[target]);
        n.left = partition(nums, L, target-1);
        n.right = partition(nums, target+1, R);
        
        return n;
        
    }
    
    private int findMax(int[] nums, int l, int r) {
        int max = l;
        for(int i = l+1; i <= r; i++) {
            if(nums[i] > nums[max]) max = i;
        }
        return max;
    }
}
