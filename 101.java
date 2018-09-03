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
    public boolean isSymmetric(TreeNode root) {
        for(int i = 1; i <= height(root); i++) {
            List<Integer> ls = new LinkedList<>();
            levelList(root, i, ls);
            if(!layerSymmetric(ls)) return false;
        }
        return true;
    }
    
    private int height(TreeNode node) {
        if(node == null) return 0;
        else return 1 + Math.max(height(node.left), height(node.right));
    }
    
    private void levelList(TreeNode node, int level, List<Integer> ls) {
        if(node == null) {
            ls.add(0);
            return;
        }
        if(level == 1) {
            ls.add(node.val);
            return;
        }
        else {
            levelList(node.left, level-1, ls);
            levelList(node.right, level-1, ls);
        }
    }
    
    private boolean layerSymmetric(List<Integer> ls) {
        for(int i = 0; i < ls.size()/2; i++) {
            if(ls.get(i) != ls.get(ls.size()-i-1)) return false;
        }
        return true;
    }
}
