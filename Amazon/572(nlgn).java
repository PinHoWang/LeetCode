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
    public boolean isSubtree(TreeNode s, TreeNode t) {
        // Traverse the tree s and add the node into a list
        // Then, traverse the list to find whether there is a subtree as same as t
        List<TreeNode> ls = new ArrayList<>();
        treeToList(ls, s);
        for(TreeNode node : ls) {
            if(checkSubTree(node, t)) return true;
        }
        
        return false;
    }
    
    private void treeToList(List<TreeNode> ls, TreeNode s) {
        if(s == null) return;
        ls.add(s);
        treeToList(ls, s.left);
        treeToList(ls, s.right);
    }
    
    private boolean checkSubTree(TreeNode ref, TreeNode t) {
        // Base case
        if(ref == null && t == null) return true;
        if(ref != null && t == null) return false;
        if(ref == null && t != null) return false;
        
        if(ref.val != t.val) return false;
        else {
            boolean leftResult = checkSubTree(ref.left, t.left);
            boolean rightResult = checkSubTree(ref.right, t.right);
            return (leftResult && rightResult);
        }
    }
}
