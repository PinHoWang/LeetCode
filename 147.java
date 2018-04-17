/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode insertionSortList(ListNode head) {
        if(head == null) return head;
        
        ListNode insertItem = head;
        ListNode sortedHead = new ListNode(0);
        ListNode target = sortedHead;
        ListNode next;
        
        while(insertItem != null) {
            next = insertItem.next;
            // find the positon of the insert item
            while(target.next != null && insertItem.val > target.next.val) {
                target = target.next;
            }
            insertItem.next = target.next;
            target.next = insertItem;
            target = sortedHead; // initialize the target to the begin of sorted List
            insertItem = next;
        }
        
        return sortedHead.next;
        
    }
}
