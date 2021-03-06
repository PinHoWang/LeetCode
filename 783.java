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
    public int minDiffInBST(TreeNode root) {
        List<Integer> sorted = new LinkedList<>();
        dfs(root, sorted);
        int min = Integer.MAX_VALUE;
        for(int i = 1; i < sorted.size(); i++) {
            int cur = sorted.get(i) - sorted.get(i-1);
            if(cur < min) min = cur;
        }
        
        return min;
    }
    
    private void dfs(TreeNode node, List<Integer> ls) {
        if(node == null) return;
        
        dfs(node.left, ls);
        ls.add(node.val);
        dfs(node.right, ls);
    }
}
