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
    public ListNode detectCycle(ListNode head) {
        if(head == null) return null;
        
        /** 1. HashSet approach **/
        
        // Set<ListNode> s = new HashSet<>();
        // ListNode curNode = head;
        // while(curNode.next != null) {
        //     if(s.contains(curNode)) return curNode;
        //     else {
        //         s.add(curNode);
        //         curNode = curNode.next;
        //     }
        // }
        // return null;
        
        /** 2. Two pointers approach 
          * slowNode = x + i
          * fastNode = x + i + y
          * x: Distance that not meet the cycle
          * i: Distance that slowNode walk in cycle until meet the fastNode
          * y: Distance of the cycle
          * 2(x + i) = x + i + y, cuz fastNode walk twice faster than slowNode
          * x = y - i
          * New newNode from head walk to the begining of the cycle will equal to slowNode walk the rest of the cycle
          * It means the node newNode meets slowNode is the begining of the cycle
        **/
        
        ListNode slowNode = head;
        ListNode fastNode = head;
        while(fastNode != null && fastNode.next != null) {
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
            
            if(fastNode == slowNode) break;
        }
        
        if(fastNode == null || fastNode.next == null) return null;
        
        ListNode newNode = head;
        while(newNode != null && slowNode != null) {
            if(newNode == slowNode) return newNode;
            else {
                newNode = newNode.next;
                slowNode = slowNode.next;
            }
        }
        
        return null;
    }
}
