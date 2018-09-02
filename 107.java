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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if(root == null) return new LinkedList<>();
        
        List<List<Integer>> ll = new LinkedList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()) {
            int qSize = q.size();
            List<Integer> l = new LinkedList<>();
            for(int i = 0; i < qSize; i++) {
                TreeNode n = q.poll();
                l.add(n.val);
                if(n.left != null) q.add(n.left);
                if(n.right != null) q.add(n.right);
            }
            ll.add(l);
        }
        
        List<List<Integer>> result = new LinkedList<>();
        for(int j = ll.size()-1; j >= 0; j--) {
            result.add(ll.get(j));
        }
        return result;
    }
}
