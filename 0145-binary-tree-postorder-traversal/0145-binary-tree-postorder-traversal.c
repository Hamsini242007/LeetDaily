/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* postorderTraversal(struct TreeNode* root, int* returnSize) {
    *returnSize=0;
    int* res=(int*)malloc(100*sizeof(int));
    int top=-1;
    struct TreeNode** stack=(struct TreeNode**)malloc(100*sizeof(struct TreeNode*));
    struct TreeNode* curr=root;
    struct TreeNode* lastv=NULL;
    do{
        while(curr){
            stack[++top]=curr;
            curr=curr->left;
        }
        while(!curr && top>-1){

        curr=stack[top];
        if(!curr->right || curr->right==lastv){
            res[(*returnSize)++]=curr->val;
            top--;
            lastv=curr;
            curr=NULL;
        }else{
            curr=curr->right;
        }
        }
    }while(top>-1);
    return res;
}