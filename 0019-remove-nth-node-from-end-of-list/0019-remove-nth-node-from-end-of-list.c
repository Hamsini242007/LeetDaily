/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* removeNthFromEnd(struct ListNode* head, int n) {
    struct ListNode* delete;
    // struct ListNode* temp=head;
    // int count=0;
    // while(temp!=NULL){
    //     count++;
    //     temp=temp->next;
    // }
    // if(count==n){
    //     delete=head;
    //     head=head->next;
    //     free(delete);
    //     return head;
    // }
    // temp=head;
    // for(int i=0;i<count-n-1;i++){
    //     temp=temp->next;
    // }
    // delete=temp->next;
    // temp->next=temp->next->next;
    // free(delete);
    // return head;
    struct ListNode dummy;
    dummy.next=head;
    struct ListNode* fast=&dummy;
    struct ListNode* slow=&dummy;
    for(int i=0;i<=n;i++){
        fast=fast->next;
    }
    while(fast!=NULL){
        fast=fast->next;
        slow=slow->next;
    }
    delete=slow->next;
    slow->next=slow->next->next;
    free(delete);
    return dummy.next;
}