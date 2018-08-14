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
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 0;
        if(root.left == null && root.right != null) root.left = new TreeNode(0);
        if(root.left != null && root.right == null) root.right = new TreeNode(0);
        
        int left = sumOfSubtree(root.left, true);
        int right = sumOfSubtree(root.right, false);
        return left + right;
    }
    
    // From LEFT, side = true; Form RIGHT, side = false
    private int sumOfSubtree(TreeNode node, boolean side) {
        if(node.left == null && node.right == null) {
            if(side) return node.val;
            else return 0;
        }
        if(node.left != null && node.right == null) return sumOfSubtree(node.left, true);
        if(node.right != null && node.left == null) return sumOfSubtree(node.right, false);
        
        return sumOfSubtree(node.left, true) + sumOfSubtree(node.right, false);
    }
}
