/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int sizeA = listSize(headA);
        int sizeB = listSize(headB);
        
        if(sizeA > sizeB) {
            while(sizeA > sizeB) {
                headA = headA.next;
                sizeA--;
            }
        }
        else {
            while(sizeB > sizeA) {
                headB = headB.next;
                sizeB--;
            }
        }
        
        while(headA != null) {
            if(headA == headB) return headA;
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }
    
    private int listSize(ListNode head) {
        int size = 0;
        while(head != null) {
            head = head.next;
            size++;
        }
        return size;
    }
}
