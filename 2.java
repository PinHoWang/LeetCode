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
        ListNode result = new ListNode(0);
        ListNode cur = result;
        int ten = 0;
        while(l1 != null || l2 != null || ten != 0)
        {
            int i = 0;
            if(l1 != null)
            {
                i += l1.val;
                l1 = l1.next;
            }
            if(l2 != null)
            {
                i += l2.val;
                l2 = l2.next;
            }
            
            ten = (i + cur.val)/10;
            cur.val = (i + cur.val) % 10;
            if(l1 != null || l2 != null || ten != 0) cur.next = new ListNode(ten);
            cur = cur.next;
        }
        
        return result;
    }
}
