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
    public int findSecondMinimumValue(TreeNode root) {
        if(root == null) return -1;
    
        final int min = root.val;
        int secMin = Integer.MAX_VALUE;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()) {
            int qNum = q.size();
            for(int i = 0; i < qNum; i++) {
                TreeNode n = q.poll();
                if(n.val > min && n.val < secMin) {
                    secMin = n.val;
                }
                if(n.left != null) q.add(n.left);
                if(n.right != null) q.add(n.right);
            }
        }
        if(secMin == Integer.MAX_VALUE) return -1;
        else return secMin;
    }
}
