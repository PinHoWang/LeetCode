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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        
        int lHeight = height(root.left);
        int rHeight = height(root.right);
        
        int lDiameter = diameterOfBinaryTree(root.left);
        int rDiameter = diameterOfBinaryTree(root.right);
        
        return Math.max(lHeight + rHeight, Math.max(lDiameter, rDiameter));
    }
    
    private int height(TreeNode node) {
        if(node == null) return 0;
        
        int l = height(node.left);
        int r = height(node.right);
        return (l > r) ? (1+l) : (1+r);
        //return (1 + Math.max(height(node.left), height(node.right)));
    }
}
