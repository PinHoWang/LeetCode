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
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        TreeNode cur = root;
        q.add(root);
        while(q.size() != 0) {
            TreeNode n = q.poll();
            cur = n;
            if(n.right != null) q.add(n.right);
            if(n.left != null) q.add(n.left);
        }
        return cur.val;
    }
}
