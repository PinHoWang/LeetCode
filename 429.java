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
        /* Level-order (BFS) */
//         if(root == null) return new LinkedList<>();
        
//         List<List<Integer>> ls = new LinkedList<>();
//         Queue<Node> q = new LinkedList<>();
//         //ls.add(new LinkedList<Integer>(root.val));
//         q.add(root);
        
//         while(!q.isEmpty()) {
//             int qNum = q.size();
//             List<Integer> level = new LinkedList<>();
//             for(int i = 0; i < qNum; i++) {
//                 Node n = q.poll();
//                 level.add(n.val);
//                 for(Node nn : n.children) {
//                     q.add(nn);
//                 }
//             }
//             ls.add(level);
//         }
        
//         return ls;
        
        
        /* Recursion */
        if(root == null){
            return new ArrayList<List<Integer>>();
        }
        
        List<Node> in = new ArrayList<Node>();
        in.add(root);
        
        return levelHelper(in);
    }
    
    private List<List<Integer>> levelHelper(List<Node> levelNodes){
        if(levelNodes.isEmpty()){
            return new ArrayList<List<Integer>>();
        }

        List<Integer> currLevel = new ArrayList<Integer>();
        List<Node> nextLevel = new ArrayList<Node>();
        
        for(Node n : levelNodes){
            currLevel.add(n.val);
            nextLevel.addAll(n.children);
        }
        
        List<List<Integer>> ret = levelHelper(nextLevel);
        ret.add(0, currLevel);
        
        return ret;
        
    }
}
