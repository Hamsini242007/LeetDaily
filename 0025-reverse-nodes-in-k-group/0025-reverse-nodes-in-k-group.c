/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* reverse(struct ListNode* head, int k){
    struct ListNode* curr=head;
    struct ListNode* prev=NULL;
    struct ListNode* nx=head;
    while(curr && k>0){
        nx=curr->next;
        curr->next=prev;
        prev=curr;
        curr=nx;
        k--;
    }
    return prev;
 }
struct ListNode* reverseKGroup(struct ListNode* head, int k) {
    struct ListNode dummy;
    dummy.next=head;
    struct ListNode* ptail=&dummy;
    struct ListNode* curr=head;
    struct ListNode* prev=NULL;

    while(curr){
        struct ListNode* check=curr;
        int count=0;
        while(check && count<k){
            check=check->next;
            count++;
        }
        if(count<k) break;
        struct ListNode* nxstart=check;
        struct ListNode* rh=reverse(curr,k);
        ptail->next=rh;
        curr->next=nxstart;
        ptail=curr;
        curr=nxstart;
    }
    return dummy.next;
}