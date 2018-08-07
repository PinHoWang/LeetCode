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
    public int maxDepth(Node root) {
        /* BFS */
//         if(root == null) return 0;
        
//         Queue<Node> q = new LinkedList<Node>();
//         q.add(root);
//         int count = 0, numQ = 0;
//         while(!q.isEmpty()) {
//             count++;
//             numQ = q.size();
//             for(int i = 0; i < numQ; i++) {
//                 Node n = q.poll();
//                 for(Node nn : n.children) {
//                     q.add(nn);
//                 }
//             }
//         }
        
//         return count;
        
        /* Recursion */
        if(root == null) return 0;
        int max = 0;
        //Using for loop to compare the nodes in the same level
        for(Node n : root.children) {
            max = Math.max(maxDepth(n), max);
        }
        return max + 1;
    }
}
