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
    public TreeNode invertTree(TreeNode root) {
        /* BFS */
//         if(root == null) return null;
        
//         Queue<TreeNode> q = new LinkedList<>();
//         q.add(root);
//         while(!q.isEmpty()) {
//             int qNum = q.size();
//             for(int i = 0; i < qNum; i++) {
//                 TreeNode n = q.poll();
//                 if(n.left != null && n.right != null) {
//                     q.add(n.left);
//                     q.add(n.right);
//                     TreeNode l = n.left;
//                     n.left = n.right;
//                     n.right = l;
//                 }
//                 else if(n.left != null && n.right == null) {
//                     q.add(n.left);
//                     n.right = n.left;
//                     n.left = null;
//                 }
//                 else if(n.left == null && n.right != null) {
//                     q.add(n.right);
//                     n.left = n.right;
//                     n.right = null;
//                 }
//             }
//         }
//         return root;
        
        /* Recursion */
        if(root == null) return null;
        TreeNode left = root.left;
        TreeNode right = root.right;
        root.left = invertTree(right);
        root.right = invertTree(left);
        return root;
    }
}
