/*
// Definition for a Node.
class Node {
    public int val;
    public Node next;
    public Node random;

    public Node() {}

    public Node(int _val,Node _next,Node _random) {
        val = _val;
        next = _next;
        random = _random;
    }
};
*/
class Solution {
    public Node copyRandomList(Node head) {
        // Construct next and random separatly.
        
        if(head == null) return null;
        
        // Build the next
        Node cur = head;
        while(cur != null) {
            Node n = new Node(cur.val, null, null);
            n.next = cur.next;
            cur.next = n;
            cur = n.next;
        }
        
        // Build the random
        cur = head;
        while(cur != null) {
            if(cur.random != null) cur.next.random = cur.random.next;
            cur = cur.next.next;
        }
        
        // Build the whole new list
        cur = head;
        Node newHead = cur.next;
        while(cur != null) {
            Node temp = cur.next.next;
            if(temp != null) cur.next.next = temp.next;
            else cur.next.next = null;
            cur.next = temp;
            cur = temp;
        }
        
        return newHead;
    }
}
