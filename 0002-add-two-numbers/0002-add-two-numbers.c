/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2) {
    int c=0, sum;
    struct ListNode dummy;
    struct ListNode* tail=&dummy;
    while(l1 || l2 || c){
        sum=c;
        if(l1){
            sum+=l1->val;
            l1=l1->next;
        }
        if(l2){
            sum+=l2->val;
            l2=l2->next;
        }
        struct ListNode* new=(struct ListNode*)malloc(sizeof(struct ListNode));
        new->val=sum%10;
        tail->next=new;
        tail=new;
        c=sum/10;
    }
        tail->next=NULL;
    return dummy.next;
}