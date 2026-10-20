/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* mergeTwoLists(struct ListNode* list1, struct ListNode* list2) {
    struct ListNode head;
    head.next=NULL;
    struct ListNode* new=&head;
    while(list1 && list2){
        if(list1->val<list2->val){
            new->next=list1;
            list1=list1->next;
        }else{
            new->next=list2;
            list2=list2->next;
        }
        new=new->next;
    }
    new->next= list1? list1:list2;
    return head.next;
}
//recursive