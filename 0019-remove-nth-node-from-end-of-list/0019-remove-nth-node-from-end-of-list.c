/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* removeNthFromEnd(struct ListNode* head, int n) {
    int count=0;
    struct ListNode* temp=head;
    struct ListNode* delete;
    while(temp!=NULL){
        count++;
        temp=temp->next;
    }
    if(count==n){
        delete=head;
        head=head->next;
        free(delete);
        return head;
    }
    temp=head;
    for(int i=0;i<count-n-1;i++){
        temp=temp->next;
    }
    delete=temp->next;
    temp->next=temp->next->next;
    free(delete);
    return head;
}