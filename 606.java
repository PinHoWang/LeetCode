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
    public String tree2str(TreeNode t) {
        if(t == null) return "";
        
        return preOrderTraverse(t, "");
    }
    
    private String preOrderTraverse(TreeNode n, String s) {
        s = Integer.toString(n.val);
        if(n.left != null) {
            s += "(";
            s += preOrderTraverse(n.left, s);
            s += ")";
        }
        if(n.left == null && n.right != null) s += "()";
        
        if(n.right != null) {
            s += "(";
            s += preOrderTraverse(n.right, s);
            s += ")";
        }
        
        
        return s;
    }
}
