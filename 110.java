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
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        
        if(Math.abs(countDepth(root.left) - countDepth(root.right)) > 1) return false;
        else return (isBalanced(root.left) && isBalanced(root.right));
    }
    
    private int countDepth(TreeNode node) {
        if(node == null) return 0;
        
        return 1 + Math.max(countDepth(node.left), countDepth(node.right));
    }
}
