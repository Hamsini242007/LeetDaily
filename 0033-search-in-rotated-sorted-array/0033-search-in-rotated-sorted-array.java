class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        // for(int i=0;i<=n/2;i++){
        //     int j=n-i-1;
        //     if(target==nums[i]){
        //         return i;
        //     }
        //     if(target==nums[j]){
        //         return j;
        //     }
        // }
        int mid=0,start=0,end=n-1;
        while(start<=end){
            mid=start+(end-start)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[start]<=nums[mid]){
                if(target>=nums[start] && target<nums[mid]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }else{
                if(target>nums[mid] && target<=nums[end]){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}