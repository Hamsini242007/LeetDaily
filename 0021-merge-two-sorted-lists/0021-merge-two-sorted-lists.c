/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* mergeTwoLists(struct ListNode* list1, struct ListNode* list2) {
    struct ListNode* h1=list1;
    struct ListNode* h2=list2;
    struct ListNode* head;
    struct ListNode* new;
    if(!h1) return h2;
    if(!h2) return h1;
    if(h1->val<h2->val){
        head=h1;
        h1=h1->next;
    }else{
        head=h2;
        h2=h2->next;
    }
    new=head;
    while(h1 && h2){
        if(h1->val<h2->val){
            new->next=h1;
            new=new->next;
            h1=h1->next;
        }else{
            new->next=h2;
            new=new->next;
            h2=h2->next;
        }
    }
    if(h1) new->next=h1;
    else new->next=h2;
    return head;
}