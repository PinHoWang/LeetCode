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
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        
        int r = maxDepth(root.right);
        int l = maxDepth(root.left);
        return (r > l) ? 1+r : 1+l;
        
    }
}
