int compare( const void* a,const void* b){
    int v1=abs(*(int*)a);
    int v2=abs(*(int*)b);
    return v1-v2;
}
long long maxAlternatingSum(int* nums, int numsSize) {
    long long ans=0;
    qsort(nums,numsSize, sizeof(int),compare);
    for(int i=0;i<numsSize;i++){
        ans=(i<numsSize/2)?ans-((long long)nums[i]*nums[i]):ans+((long long)nums[i]*nums[i]);
    }
    return ans;
}
