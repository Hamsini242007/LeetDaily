int sumCounts(int* nums, int numsSize) {
    int ans=0;
    for(int i=0;i<numsSize;i++){
        int count=0;
        int freq[101]={0};
        for(int j=i;j<numsSize;j++){
            if(freq[nums[j]]==0) count++;
            freq[nums[j]]++;
            // for(int k=j-1;k>=i;k--){
            //     if(nums[j]==nums[k]){
            //         count--;
            //         break;
            //     }
            // }
            ans+=(count*count);
        }
    }
    return ans;
}