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
    public List<Integer> preorder(Node root) {
        /* BFS */
//         if(root == null) return new LinkedList<>();
        
//         List<Integer> ls = new LinkedList<>();
//         Stack<Node> s = new Stack<>();
//         s.push(root);
//         while(!s.empty()) {
//             Node n = s.pop();
//             ls.add(n.val);
//             // push right to left of the children to make sure left first
//             List<Node> rtol = n.children;
//             Collections.reverse(n.children);
//             for(Node nn : rtol) {
//                 s.push(nn);
//             }
//         }
//         return ls;
        
        /* Recursion */
        if(root == null) return new LinkedList<>();
        List<Integer> ls = new LinkedList<>();
        recursion(root, ls);
        return ls;
    }
    
    private void recursion(Node n, List<Integer> l) {
        if(n == null) return;
        
        l.add(n.val);
        for(Node nn : n.children) {
            recursion(nn, l);
        }
    }
}
