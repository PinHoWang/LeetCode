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
    public int pathSum(TreeNode root, int sum) {
        // DSF + BFS Solution
        if(root == null) return 0;
        
        int count = 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(q.size() != 0)
        {
            TreeNode n = q.poll();
            count += dfs(n, sum, 0);
            if(n.left != null) q.add(n.left);
            if(n.right != null) q.add(n.right);
        }
        return count;
    }
    
    private int dfs(TreeNode n, int sum, int total)
    {
        if(n == null) return 0;
        
        if(n.val + total == sum) return 1 + dfs(n.left, sum, n.val+total) + dfs(n.right, sum, n.val+total);
        return dfs(n.left, sum, n.val+total) + dfs(n.right, sum, n.val+total);
    }
}
