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
        // Using the extra variable to record the second digit
        ListNode head = new ListNode(0);
        ListNode cur = head;
        int temp = 0;
        while(l1 != null || l2 != null) {
            if(l1 == null) {
                int v = l2.val + temp;
                cur.next = new ListNode(v % 10);
                cur = cur.next;
                temp =  v / 10;
                l2 = l2.next;
            }
            else if(l2 == null) {
                int v = l1.val + temp;
                cur.next = new ListNode(v % 10);
                cur = cur.next;
                temp = v / 10;
                l1 = l1.next;
            }
            else {
                // l1.next && l2.next are not null
                int v = l1.val + l2.val + temp;
                cur.next = new ListNode(v % 10);
                cur = cur.next;
                temp = v / 10;
                l1 = l1.next;
                l2 = l2.next;
            }
        }
        
        if(temp != 0) {
            if(temp / 10 == 0) cur.next = new ListNode(temp % 10);
            else {
                cur.next = new ListNode(temp % 10);
                cur.next.next = new ListNode(temp / 10);
            }
        }
        // int digit = 0;
        // ListNode ptr = head.next;
        // int result = 0;
        // while(ptr != null) {
        //     result += (ptr.val * 10^digit);
        //     digit++;
        // }
        return head.next;
    }
}
