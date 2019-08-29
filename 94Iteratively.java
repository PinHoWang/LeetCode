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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        Stack<TreeNode> s = new Stack<TreeNode>();
        TreeNode cur = root;
        
        while(!s.empty() || cur != null) {
            if(cur != null) {
                s.push(cur);
                cur = cur.left;
            }
            else {
                cur = s.pop();
                result.add(cur.val);
                cur = cur.right;
            }
        }
        return result;
    }
}
