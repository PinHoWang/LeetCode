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
    public List<Integer> boundaryOfBinaryTree(TreeNode root) {
        if(root == null) return new ArrayList<>();
        
        List<TreeNode> left = new ArrayList<>();
        if(root.left == null) left.add(root);
        else leftSubTree(root, left);
        List<TreeNode> leaf = new ArrayList<>();
        findLeaf(root, leaf);
        List<TreeNode> right = new ArrayList<>();
        if(root.right == null) right.add(root);
        else rightSubTree(root, right);
        Collections.reverse(right);
        
        List<Integer> result = new ArrayList<>();
        for(int l = 0; l < left.size(); l++) {
            result.add(left.get(l).val);
        }
        
        if(leaf.get(0) != left.get(left.size()-1)) result.add(leaf.get(0).val);
        for(int le = 1; le < leaf.size(); le++) {
            result.add(leaf.get(le).val);
        }
        
        if(right.get(0) != leaf.get(leaf.size()-1)) {
            if(right.size() > 1) result.add(right.get(0).val);
            else {
                if(right.get(0) != left.get(0)) result.add(right.get(0).val);
            }
        }
        for(int r = 1; r < right.size()-1; r++) {
            result.add(right.get(r).val);
        }
        
        return result;
        
    }

    private void leftSubTree(TreeNode node, List<TreeNode> ls) {
        if(node == null) return;
        
        ls.add(node);
        if(node.left != null) leftSubTree(node.left, ls);
        else {
            if(node.right != null) leftSubTree(node.right, ls);
        }
    }
    
    private void findLeaf(TreeNode node, List<TreeNode> ls) {
        if(node == null) return;
        
        if(node.left == null && node.right == null) {
            ls.add(node);
            return;
        }
        
        if(node.left != null) findLeaf(node.left, ls);
        if(node.right != null) findLeaf(node.right, ls);
    }
    
    private void rightSubTree(TreeNode node, List<TreeNode> ls) {
        if(node == null) return;
        
        ls.add(node);
        if(node.right != null) rightSubTree(node.right, ls);
        else {
            if(node.left != null) rightSubTree(node.left, ls);
        }
    }
    
    
}
