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
    public List<String> binaryTreePaths(TreeNode root) {
        if(root == null) return new LinkedList<>();
        
        List<String> result = new LinkedList<>();
        String temPath = "";
        path(root, temPath, result);
        return result;
        
    }
    
    private void path(TreeNode node, String path, List<String> l) {
        if(node.left == null && node.right == null) l.add(path + node.val);
        if(node.left != null) path(node.left, path + node.val + "->", l);
        if(node.right != null) path(node.right, path + node.val + "->", l);
    }
}
