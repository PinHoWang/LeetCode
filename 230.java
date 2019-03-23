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
    public int kthSmallest(TreeNode root, int k) {
        if(root == null) return -1;
        
        List<Integer> list = new ArrayList<>();
        helper(root, list);
        if(list.size() >= k) {
            return list.get(k-1);
        }
        return -1;
    }
    
    private void helper(TreeNode root, List<Integer> ordered) {
        if(root == null) return;
        
        helper(root.left, ordered);
        ordered.add(root.val);
        helper(root.right, ordered);
    }
}
