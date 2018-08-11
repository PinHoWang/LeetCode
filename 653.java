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
    public boolean findTarget(TreeNode root, int k) {
        if(root == null) return false;
        
        Queue<TreeNode> q = new LinkedList<>();
        Set<Integer> s = new HashSet<>();
        
        q.add(root);
        while(!q.isEmpty()) {
            int qNum = q.size();
            for(int i = 0; i < qNum; i++) {
                TreeNode n = q.poll();
                if(s.contains(k-n.val)) return true;
                s.add(n.val);
                if(n.left != null) q.add(n.left);
                if(n.right != null) q.add(n.right);
            }
        }
        return false;
    }
}
