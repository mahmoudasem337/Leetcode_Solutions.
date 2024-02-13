/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* removeElements(ListNode* head, int value) {
        while(head!=nullptr && head->val==value){
            head = head->next;
        }
        ListNode*cur1=head;
while(cur1 && cur1->next){
    if(cur1->next->val==value){
    cur1->next=cur1->next->next;
}else
cur1=cur1->next;
}
return head;
}
};