/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null) return false;
        
        
        // Using set to record nodes
        // Set<ListNode> s = new HashSet<>();
        // ListNode curNode = head;
        // while(curNode.next != null) {
        //     if(s.contains(curNode)) return true;
        //     else {
        //         s.add(curNode);
        //         curNode = curNode.next;
        //     }
        // }
        // return false;
        
        // Two pointers
        ListNode fastNode = head.next;
        ListNode slowNode = head;
        //Base case
        if(fastNode == null) return false;
        while(fastNode != null && slowNode != null) {
            if(fastNode == slowNode) return true;
            else {
                fastNode = fastNode.next;
                if(fastNode != null && fastNode.next != null) fastNode = fastNode.next;
                else return false;
                slowNode = slowNode.next;
            }
        }
        return false;
        
    }
}
