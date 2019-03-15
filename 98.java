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
    public boolean isValidBST(TreeNode root) {
        if(root == null) return true;
        
        List<Integer> res = new ArrayList<>();
        inorderTraversal(root, res);
        for(int i = 1; i < res.size(); i++) {
            if(res.get(i-1) >= res.get(i)) return false;
        }
        
        return true;
    }
    
    private void inorderTraversal(TreeNode root, List<Integer> res) {
        if(root != null) {
            inorderTraversal(root.left, res);
            res.add(root.val);
            inorderTraversal(root.right, res);
        }
    }
}
