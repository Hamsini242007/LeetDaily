/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* rotateRight(struct ListNode* head, int k) {
    if(!head || !head->next || k==0) return head;
    int len=1;
    struct ListNode* curr=head;
    while(curr->next){
        len++;
        curr=curr->next;
    }
    k=k%len;
    if(k==0) return head;
    curr->next=head;
    k=len-k;
    while(k>0){
        curr=curr->next;
        k--;
    }
    head=curr->next;
    curr->next=NULL;
    return head;
}