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
    private int sum = 0;
    public int rangeSumBST(TreeNode root, int L, int R) {
        if(root == null) return sum;
        dfs(root, L, R);
        return sum;
    }
    
    private void dfs(TreeNode node, int L, int R) {
        if(node == null) return;
        
        if(node.val >= L && node.val <= R) {
            sum += node.val;
            dfs(node.left, L, R);
            dfs(node.right, L, R);
        }
        else if(node.val < L) dfs(node.right, L, R);
        else dfs(node.left, L, R);
    }
}
