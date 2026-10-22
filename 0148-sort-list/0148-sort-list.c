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
    struct ListNode* slow=head;
    struct ListNode* fast=head;
    struct ListNode* prev;
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
struct ListNode* split(struct ListNode* head, int temp) {
    struct ListNode* curr=head;
    for(int i=1;curr && i<temp;i++) curr=curr->next;
    if(!curr) return NULL;
    struct ListNode* next=curr->next;
    curr->next=NULL;
    return next;
}
// struct ListNode* sortList(struct ListNode* head) {
//     if(!head || !head->next) return head;
//     struct ListNode* curr=head;
//     int count=0;
//     while(curr){
//         count++;
//         curr=curr->next;
//     }
//     struct ListNode dummy;
//     dummy.next=head;
//     for(int j=1;j<count;j*=2){
//         struct ListNode* prev=&dummy;
//         curr=dummy.next;
//         while(curr){
//             struct ListNode* left=curr;
//             struct ListNode* right=split(left,j);
//             curr=split(right,j);
//             prev->next=helper(left,right);
//             while(prev->next) prev=prev->next;
//         }
//     }
//     return dummy.next;
// }