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
    private TreeNode result = new TreeNode(0);
    private TreeNode temp = result;
    
    public TreeNode increasingBST(TreeNode root) {
        if(root == null) return null;
        
        inOrder(root);
        return result.right;
        
    }
    
    private void inOrder(TreeNode node) {
        if(node == null) return;
                
        inOrder(node.left);
        temp.right = new TreeNode(node.val);
        temp = temp.right;
        inOrder(node.right);
    }
}
