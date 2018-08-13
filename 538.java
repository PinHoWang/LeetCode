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
    
    private int sum = 0;
    public TreeNode convertBST(TreeNode root) {
        convertTree(root);
        return root;
    }
    
    private void convertTree(TreeNode node) {
        if(node == null) return;
        convertTree(node.right);
        node.val += sum;
        sum = node.val;
        convertTree(node.left);
    }
} 
