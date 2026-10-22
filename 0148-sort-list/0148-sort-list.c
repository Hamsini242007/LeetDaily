/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* helper(struct ListNode* h1, struct ListNode* h2){
    struct ListNode dummy;
    struct ListNode* tail=&dummy;
    while(h1 && h2){
        if(h1->val<=h2->val){
            tail->next=h1;
            h1=h1->next;
        }else{
            tail->next=h2;
            h2=h2->next;
        }
        tail=tail->next;
    }
    if(h1) tail->next=h1;
    else tail->next=h2;
    return dummy.next;
}
struct ListNode* sortList(struct ListNode* head) {
    if(!head || !head->next) return head;
    struct ListNode* fast=head;
    int count=0;
    while(fast){
        count++;
        fast=fast->next;
    }
    struct ListNode* slow=head;
    struct ListNode* prev;
    fast=head;
    while(fast && fast->next){
        prev=slow;
        slow=slow->next;
        fast=fast->next->next;
    }
    prev->next=NULL;
    struct ListNode* left=sortList(head);
    struct ListNode* right=sortList(slow);
    return helper(left,right);
}