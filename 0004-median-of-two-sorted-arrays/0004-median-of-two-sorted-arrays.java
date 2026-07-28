class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length, n=nums2.length;
        if(m>n){
           return calculation(nums2, nums1,0,n);
        }else{
           return calculation(nums1,nums2, 0,m);
        }
    }
    private double calculation(int[] sarr,int[] larr, int min,int max){
        int l=sarr.length+larr.length;
        while(min<=max){
            int mid1=min+(max-min)/2;
            int mid2=((l+1)/2)-mid1;
            int l1 = (mid1 == 0) ? Integer.MIN_VALUE : sarr[mid1 - 1];
            int r1 = (mid1 == sarr.length) ? Integer.MAX_VALUE : sarr[mid1];
            int l2 = (mid2 == 0) ? Integer.MIN_VALUE : larr[mid2 - 1];
            int r2 = (mid2 == larr.length) ? Integer.MAX_VALUE : larr[mid2];
            if(l1<=r2 && l2<=r1){
                if(l%2!=0){
                    return Math.max(l1,l2);
                }else{
                    return (Math.max(l1, l2) + Math.min(r1, r2)) / 2.0;
                }
            }else{
                if(l1>r2) max=mid1-1;
                else min =mid1+1;
            }
        }
        return 0.0;
    }
}