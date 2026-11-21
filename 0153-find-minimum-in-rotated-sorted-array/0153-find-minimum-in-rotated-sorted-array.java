class Solution {
    public int findMin(int[] nums) {
        int n=nums.length,mid=0,end=n-1,start=0,min=nums[0];
        while(start<end){
            mid=start+(end-start)/2;
            if(nums[mid]>nums[end]){
                start=mid+1;
            }else{
                end=mid;
            }
        }
        return nums[start];
    }
}