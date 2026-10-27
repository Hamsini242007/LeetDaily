/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* merge(struct ListNode* h1,struct ListNode* h2){
    if(!h1) return h2;
    else if(!h2) return h1;
    else{
        struct ListNode h;
        struct ListNode* tail=&h;
        while(h1 && h2){
            if(h1->val < h2->val){
                tail->next=h1;
                h1=h1->next;
            }else{
                tail->next=h2;
                h2=h2->next;
            }
            tail=tail->next;
        }
        tail->next=h1?h1:h2;
        return h.next;
    }
}
struct ListNode* sort(struct ListNode** lists, int start,int end){
    if(start>end) return NULL;
    if(start==end) return lists[start];
    int mid=start+(end-start)/2;
    struct ListNode* left=sort(lists,start,mid);
    struct ListNode* right=sort(lists,mid+1,end);
    return merge(left,right);
}
struct ListNode* mergeKLists(struct ListNode** lists, int listsSize) {
    if(listsSize<1) return NULL;
    // struct ListNode* old=lists[0];
    // for(int i=1;i<listsSize;i++){
    //     struct ListNode* curr=lists[i];
    //     old=merge(old,curr);
    // }
    // return old;
    return sort(lists,0,listsSize-1);
}