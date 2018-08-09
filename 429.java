/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        if(root == null) return new LinkedList<>();
        
        List<List<Integer>> ls = new LinkedList<>();
        Queue<Node> q = new LinkedList<>();
        //ls.add(new LinkedList<Integer>(root.val));
        q.add(root);
        
        while(!q.isEmpty()) {
            int qNum = q.size();
            List<Integer> level = new LinkedList<>();
            for(int i = 0; i < qNum; i++) {
                Node n = q.poll();
                level.add(n.val);
                for(Node nn : n.children) {
                    q.add(nn);
                }
            }
            ls.add(level);
        }
        
        return ls;
    }
}
