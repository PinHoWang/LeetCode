/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;
        
        // Allocate two pointers to let first to middle
        ListNode first = head;
        ListNode second = head;
        while(second != null && second.next != null) {
            first = first.next;
            second = second.next.next;
        }
        
        // Reverse the 2nd pointer
        ListNode head2 = Reverse(first);
        
        // Compare
        while(head2 != null) {
            if(head.val != head2.val) return false;
            else {
                head = head.next;
                head2 = head2.next;
            }
        }
        return true;
    }
    
    private ListNode Reverse(ListNode head) {
        ListNode pre = null;
        while(head != null) {
            ListNode next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
}
