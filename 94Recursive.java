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
    public List<Integer> inorderTraversal(TreeNode root) {
        // I'd like to use the trivial method to approach the problem, which is recursive
        List<Integer> result = new ArrayList<Integer>();
        helper(result, root);
        return result;
    }
    
    private void helper(List<Integer> ls, TreeNode node) {
        if(node == null) return;
        helper(ls, node.left);
        ls.add(node.val);
        helper(ls, node.right);
    }
}
