/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
// struct ListNode* rotateRight(struct ListNode* head, int k) {
//     if(!head || !head->next) return head;
//     int len=0;
//     struct ListNode* curr=head;
//     struct ListNode* start=head;
//     struct ListNode* temp=head;
//     struct ListNode* prev=head;
//     while(curr){
//         len++;
//         curr=curr->next;
//     }
//     k=k%len;
//     if(k==0) return head;
//     curr=head;
//     len-=k;
//     while(len>0){
//         prev=curr;
//         curr=curr->next;
//         len--;
//     }
//     start=curr;
//     if(curr->next){
//         while(curr->next){
//             curr=curr->next;
//         }
//         curr->next=head;
//     }else{
//         start->next=head;
//     }
//         prev->next=NULL;
//     return start;
// }
struct ListNode* rotateRight(struct ListNode* head, int k) {
    if (!head || !head->next || k == 0) return head;
    
    struct ListNode* curr = head;
    int len = 1;
    
    while (curr->next) {
        curr = curr->next;
        len++;
    }
    
    curr->next = head; // Make it a circular list
    k = k % len;
    k = len - k;
    
    while (k > 0) {
        curr = curr->next;
        k--;
    }
    
    head = curr->next;
    curr->next = NULL;
    
    return head;
}