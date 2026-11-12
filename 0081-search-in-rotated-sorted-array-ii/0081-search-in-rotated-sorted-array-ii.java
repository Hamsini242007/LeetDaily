class Solution {
    public boolean search(int[] nums, int target) {
        int n=nums.length;
        int mid=0,start=0,end=n-1;
        while(start<=end){
            mid=start+(end-start)/2;
            if(nums[mid]==target){
                return true;
            }
            if (nums[start] == nums[mid] && nums[mid] == nums[end]) {
                start++;
                end--;
                continue;
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
        return false;
    }
}