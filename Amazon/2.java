/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null) return null;
        else if(l1 == null && l2 != null) return l2;
        else if(l1 != null && l2 == null) return l1;
        
        ListNode preHead = new ListNode(0);
        ListNode cur = preHead;
        int x = 0;
        while(l1 != null || l2 != null) {
            if(l1 == null) {
                int rem = (l2.val + x) % 10;
                x = (l2.val + x) / 10;
                cur.next = new ListNode(rem);
                cur = cur.next;
                l2 = l2.next;
            }
            else if(l2 == null) {
                int rem = (l1.val + x) % 10;
                x = (l1.val + x) / 10;
                cur.next = new ListNode(rem);
                cur = cur.next;
                l1 = l1.next;
            }
            else {
            
                int rem = (l1.val + l2.val + x) % 10;
                cur.next = new ListNode(rem);
                cur = cur.next;
            
                x = (l1.val + l2.val + x) / 10;
                l1 = l1.next;
                l2 = l2.next;
            }
        }
        
        if(x != 0) cur.next = new ListNode(x);
        
        return preHead.next;
    }
}
