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
    private int result = 0;
    
    public int findTilt(TreeNode root) {
        if(root == null) return 0;
        
        int sum = helper(root);
        return result;
    }
    
    private int helper(TreeNode node) {
        if(node == null) return 0;
        
        int left = helper(node.left);
        int right = helper(node.right);
        node.val += (left + right);
        result += Math.abs(left - right);
        return node.val;
    }
}
