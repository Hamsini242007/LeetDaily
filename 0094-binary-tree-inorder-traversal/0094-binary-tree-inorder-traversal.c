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
int* inorderTraversal(struct TreeNode* root, int* returnSize) {
    int* res=(int*)malloc(100*sizeof(int));
    *returnSize=0;
    struct TreeNode** stack=(struct TreeNode**)malloc(100*sizeof(struct TreeNode*));
    int top=-1;
    struct TreeNode* curr=root;
    while(curr || top>-1){
        while(curr){
            stack[++top]=curr;
            curr=curr->left;
        }
        curr=stack[top--];
        res[(*returnSize)++]=curr->val;
        curr=curr->right;
    }
    return res;
}