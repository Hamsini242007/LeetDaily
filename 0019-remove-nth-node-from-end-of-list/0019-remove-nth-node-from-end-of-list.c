/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* removeNthFromEnd(struct ListNode* head, int n) {
    if(head->next==NULL) return NULL;
    int count=0;
    struct ListNode* temp=head;
    while(temp!=NULL){
        count++;
        temp=temp->next;
    }
    if(count==n){
        head=head->next;
        return head;
    }
    temp=head;
    for(int i=0;i<count-n-1;i++){
        temp=temp->next;
    }
    if(temp->next!=NULL)
    temp->next=temp->next->next;
    else temp->next=NULL;
    return head;
}