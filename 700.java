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
    public TreeNode searchBST(TreeNode root, int val) {
        /* BFS */
//         if(root == null) return null;
        
//         Queue<TreeNode> q = new LinkedList<>();
//         q.add(root);
//         while(!q.isEmpty()) {
//             int qNum = q.size();
//             for(int i = 0; i < qNum; i++) {
//                 TreeNode n = q.poll();
//                 if(n.val == val) return n;
//                 if(n.left != null) q.add(n.left);
//                 if(n.right != null) q.add(n.right);
//             }
//         }
        
//         return null;
        
        /* DFS */
        if(root == null) return null;
        if(root.val == val) return root;
        
        TreeNode left = searchBST(root.left, val);
        TreeNode right = searchBST(root.right, val);
        
        if(left != null) return left;
        if(right != null) return right;
        
        return null;
    }
}
