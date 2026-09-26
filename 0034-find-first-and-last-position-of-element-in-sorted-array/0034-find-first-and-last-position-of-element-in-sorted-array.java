class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans=new int[]{-1,-1};
        //int n=nums.length;
        // for(int i=0;i<n;i++){
        //     if(target==nums[i]){
        //         ans[0]=i;
        //         ans[1]=i;
        //         while(i+1<n && nums[i]==nums[i+1]){
        //             i++;
        //         }
        //         ans[1]=i;
        //         break;
        //     }
        // }
        ans[0]=getBounds(nums,target,true);
        ans[1]=getBounds(nums,target,false);
        return ans;
    }
        int getBounds(int[] nums,int target,boolean isFirst){
            int n=nums.length;
            int mid=0,end=n-1,start=0,bound=-1;
            while(start<=end){
                mid=start+(end-start)/2;
                if(target==nums[mid]){
                    bound=mid;
                    if(isFirst){
                        end=mid-1;
                    }else{
                        start=mid+1;
                    }
                }else if(target>nums[mid]){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
            return bound;
        }
}