/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
 int compare(const void* a,const void* b){
    return *(int*)a-*(int*)b;
}
int* targetIndices(int* nums, int numsSize, int target, int* returnSize) {
    // int* ans=(int*)malloc(numsSize*sizeof(int));
    // int j=-1;
    // if(ans){
    //     qsort(nums,numsSize,sizeof(int),compare);
    //     for(int i=0;i<numsSize;i++) if(nums[i]==target) ans[++j]=i;
    // }
    // *returnSize=j+1;
    int count=0,scount=0;
    for(int i=0;i<numsSize;i++){
        if(nums[i]==target) count++;
        else if(nums[i]<target) scount++;
    }
    int* ans=(int*)malloc(count*sizeof(int));
    for(int i=0;i<count;i++) ans[i]=scount+i;
    *returnSize=count;
    return ans;
}
