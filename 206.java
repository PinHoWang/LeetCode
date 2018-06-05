/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;
        if(head.next == null) return head;
        
        ListNode temp1 = head;
        ListNode temp2 = temp1.next;
        ListNode temp3 = temp2.next;
        
        while(true) {
            temp2.next = temp1;
            temp1 = temp2;
            temp2 = temp3;
            if(temp3 == null) { break; }
            temp3 = temp3.next;
        }
        
        head.next = null;
        head = temp1;
        return head;
    }
}
