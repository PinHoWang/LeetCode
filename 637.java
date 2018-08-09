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
    public List<Double> averageOfLevels(TreeNode root) {
        if(root == null) return null;
        
        /* BFS solution */
//         List<Double> ls = new LinkedList<>();
//         Queue<TreeNode> q = new LinkedList<>();
//         q.add(root);
//         while(!q.isEmpty()) {
//             double sum = 0;
//             int qNum = q.size();
//             for(int i = 0; i < qNum; i++) {
//                 TreeNode n = q.poll();
//                 sum += n.val;
//                 if(n.right != null) q.add(n.right);
//                 if(n.left != null) q.add(n.left);
//             }
//             ls.add(sum/qNum);
//         }
        
//         return ls;
        
        /* Recursion solution */
        List<Double> ls = new LinkedList<>();
        List<Integer> count = new LinkedList<>();
        levelRecursion(root, ls, count, 0);
        for(int i = 0; i < ls.size(); i++) {
            ls.set(i, ls.get(i)/count.get(i));
        }
        
        return ls;
    }
    
    private void levelRecursion(TreeNode node, List<Double> l, List<Integer> c, int level) {
        if(node == null) return;
        
        if(l.size() == level) {
            l.add(level, 0.0);
            c.add(level, 0);
        }
        
        l.set(level, l.get(level) + (double) node.val);
        c.set(level, c.get(level)+1);
        levelRecursion(node.left, l, c, level+1);
        levelRecursion(node.right, l, c, level+1);
    }
}
