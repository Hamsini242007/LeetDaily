int sumCounts(int* nums, int numsSize) {
    int ans=0;
    for(int i=0;i<numsSize;i++){
        int count=0;
        for(int j=i;j<numsSize;j++){
            count++;
            for(int k=j-1;k>=i;k--){
                if(nums[j]==nums[k]){
                    count--;
                    break;
                }
            }
            ans+=(count*count);
        }
    }
    return ans;
}