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
    public List<Integer> postorder(Node root) {
        /* Iteratively (Two Stacks) */
//         if(root == null) return new LinkedList<>();
        
//         Stack<Node> s1 = new Stack<Node>();
//         Stack<Node> s2 = new Stack<Node>();
        
//         s1.push(root);
//         while(!s1.empty()) {
//             Node n = s1.pop();
//             s2.push(n);
//             for(Node nn : n.children) {
//                 s1.push(nn);
//             }
//         }
        
//         List<Integer> ls = new LinkedList<>();
//         while(!s2.empty()) {
//             ls.add(s2.pop().val);
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
        
        for(Node nn : n.children) {
            recursion(nn, l);
        }
        
        l.add(n.val);
    }
}
