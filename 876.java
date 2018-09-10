/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        int size = listSize(head);
        
        ListNode result = head;
        for(int i = size/2; i > 0; i--) {
            result = result.next;
        }
        return result;
    }
    
    private int listSize(ListNode head) {
        if(head == null) return 0;
        
        return 1 + listSize(head.next);
    }
}
