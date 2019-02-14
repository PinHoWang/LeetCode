class Solution {
    
    class TreeNode {
        private int val;
        private int total;
        private TreeNode left;
        private TreeNode right;
        public TreeNode(int val, int total)
        {
            this.val = val;
            this.total = total;
        }
    }
    
    public List<String> generateParenthesis(int n) {
        List<String> result = new LinkedList<>();
        
        TreeNode root = new TreeNode(1, 1);
        construct(root, 1, n*2);
        
        String s = "";
        helper(root, s, result);
        return result;
        
    }
    
    private void construct(TreeNode root, int depth, int maxDepth) {
        if(depth > maxDepth-1) return;
        
        if(root.total > 0) {
            root.left = new TreeNode(-1, root.total-1);
            construct(root.left, depth+1, maxDepth);
        }
        root.right = new TreeNode(1, root.total+1);
        construct(root.right, depth+1, maxDepth);
    }
    
    private void helper(TreeNode root, String s, List<String> result) {
        
        
        if(root.left == null && root.right == null)
        {
            if(root.total == 0) result.add(s + ")");
            return;
        }
        
        if(root.val == 1) s += "(";
        else s += ")";
        if(root.left != null) helper(root.left, s, result);
        if(root.right != null) helper(root.right, s, result);
    }
}
