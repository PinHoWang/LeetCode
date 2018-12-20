/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int numComponents(ListNode head, int[] G) {
        boolean flag = true;
        Set<Integer> s = new HashSet<>();
        Set<Integer> compon = new HashSet<>();
        for(int i = 0; i < G.length; i++) compon.add(G[i]);
        
        while(head != null) {
            if(compon.contains(head.val)) {
                if(flag) {
                    s.add(head.val);
                    flag = false;
                }
            }
            else { flag = true; }
            head = head.next;
        }
        return s.size(); 
    }
}
