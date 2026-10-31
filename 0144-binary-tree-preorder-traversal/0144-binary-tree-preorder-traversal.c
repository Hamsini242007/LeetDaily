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
int* preorderTraversal(struct TreeNode* root, int* returnSize) {
    *returnSize=0;
    int* res=(int*)malloc(100*sizeof(int));
    int top=-1;
    struct TreeNode** stack=(struct TreeNode**)malloc(100*sizeof(struct TreeNode*));
    struct TreeNode* curr=root;
    while(curr || top>-1){
        while(curr){
            res[(*returnSize)++]=curr->val;
            stack[++top]=curr;
            curr=curr->left;
        }
        curr=stack[top--];
        curr=curr->right;
    }
    free(stack);
    return res;
}