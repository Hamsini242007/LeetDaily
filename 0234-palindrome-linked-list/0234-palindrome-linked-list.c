/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
bool isPalindrome(struct ListNode* head) {
    if (head == NULL || head->next == NULL) return true;
    struct ListNode *slow=head;
    struct ListNode *fast=head;
    while(fast!=NULL && fast->next!=NULL){
        slow=slow->next;
        fast=fast->next->next;
    }
    struct ListNode *prev=NULL;
    while(slow!=NULL){
        struct ListNode *temp=slow->next;
        slow->next=prev;
        prev=slow;
        slow=temp;
    }
    fast=head;
    while(prev!=NULL){
        if(prev->val!=fast->val) return false;
        prev=prev->next;
        fast=fast->next;
    }
    return true;
}