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
        /* Iteratively */
        if(root == null) return true;
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()) {
            int qSize = q.size();
            List<Integer> l = new LinkedList<>();
            for(int i = 0; i < qSize; i++) {
                TreeNode n = q.poll();
                if(n.left != null) {
                    q.add(n.left);
                    l.add(n.left.val);
                }
                else { l.add(0); }
                if(n.right != null) {
                    q.add(n.right);
                    l.add(n.right.val);
                }
                else { l.add(0); }
            }
            
            // Check Symmetric
            for(int j = 0; j < l.size()/2; j++) {
                if(l.get(j) != l.get(l.size()-j-1)) return false;
            }
        }
        return true;
    }
}
