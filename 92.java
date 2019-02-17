/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head == null || head.next == null) return head;
        
        /* Find the start postion */
        ListNode cur = head;
        ListNode pre = null;
        int temp = m;
        while(temp > 1)
        {
            pre = cur;
            cur = cur.next;
            temp--;
        }
        
        /* Reverse */
        ListNode con = pre;
        ListNode tail = cur;
        ListNode nextNode = null;
        while(n >= m)
        {
            nextNode = cur.next;
            cur.next = pre;
            pre = cur;
            cur = nextNode;
            n--;
        }
        
        if(con != null) con.next = pre;
        else head = pre;
        tail.next = cur;
        
        return head;
    }
}
