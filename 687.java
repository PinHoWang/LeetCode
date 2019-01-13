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
    private int longest = 0;

    public int longestUnivaluePath(TreeNode root) {
        if(root == null) return 0;
        int i = helper(root, -1);
        return longest;
    }
    
    private int helper(TreeNode node, int prev) {
        if(node == null) return 0;
        
        int leftSum = helper(node.left, node.val);
        int rightSum = helper(node.right, node.val);
        longest = Math.max(longest, leftSum + rightSum);
        if(node.val == prev) return 1 + Math.max(leftSum, rightSum);
        return 0;
        
    }
}
