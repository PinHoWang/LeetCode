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
    private boolean result = false;
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null) return false;
        
        pathSum(root, 0, sum);
        return result;
    }
    
    private void pathSum(TreeNode node, int curSum, int sum) {
        if(node == null) return;
        if(node.left == null && node.right == null) {
            if(node.val+curSum == sum) result = true;
        }
        
        pathSum(node.left, node.val+curSum, sum);
        pathSum(node.right, node.val+curSum, sum);
    }
}
