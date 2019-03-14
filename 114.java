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
    public void flatten(TreeNode root) {
        if(root == null) return;
        
        TreeNode tempL = root.left;
        TreeNode tempR = root.right;
        
        root.left = null;
        
        flatten(tempL);
        flatten(tempR);
        
        root.right = tempL;
        
        TreeNode cur = root;
        while(cur.right != null) cur = cur.right;
        cur.right = tempR;
    }
}
