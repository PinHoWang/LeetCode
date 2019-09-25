/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    
    private int flag = 1; // Record ptr1 or ptr2, which to update
    
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode ptr1 = l1;
        ListNode ptr2 = l2;
        ListNode head = new ListNode(0);
        ListNode curPtr = head;
        
        while(ptr1 != null || ptr2 != null) {
            if(ptr1 == null) {
                curPtr.next = ptr2;
                curPtr = curPtr.next;
                ptr2 = ptr2.next;
            }
            else if(ptr2 == null) {
                curPtr.next = ptr1;
                curPtr = curPtr.next;
                ptr1 = ptr1.next;
            }
            else {
                curPtr.next = compareListNode(ptr1, ptr2);
                curPtr = curPtr.next;
                if(flag == 1) ptr1 = ptr1.next;
                else ptr2 = ptr2.next;
            }
        }
        
        return head.next;
    }
    
    private ListNode compareListNode(ListNode l1, ListNode l2) {
        if(l1.val > l2.val || l1 == null) {
            flag = 2;
            return l2;
        }
        flag = 1;
        return l1;
    }
}
