/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        // counting the numbers of the element
        int length = 1;
        ListNode* nodePtr = head;
        while(nodePtr->next != NULL)
        {
            length++;
            nodePtr = nodePtr->next;
        }
        
        
        ListNode* nodePtr1 = head;
        if(length == 1)
        {
            head = nodePtr1->next;
        }
        else
        {
            int flag = 1;
            
            while(flag < (length - n))
            {
                nodePtr1 = nodePtr1->next;
                flag++;
            }
        
            (*nodePtr1).next = nodePtr1->next->next;
        }
        
        return head;
        
            
    }
};
