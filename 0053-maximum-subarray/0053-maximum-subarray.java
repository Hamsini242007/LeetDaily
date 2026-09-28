class Solution {
    public int maxSubArray(int[] nums) {
        int msum=nums[0],csum=nums[0],n=nums.length;
        for(int i=1;i<n;i++){
            csum=Math.max(nums[i],csum+nums[i]);
            msum=Math.max(csum,msum);
        }
        return msum;
    }
}