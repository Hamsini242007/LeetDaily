class Solution {
    public int removeElement(int[] nums, int val) {
        // int j=0;
        // int[] num=new int[nums.length];
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]!=val){
        //         num[j]=nums[i];
        //         j++;
        //     }

        // }
        // for(int i=0;i<num.length;i++){
        //  nums[i]=num[i];
        // }
        // for(int i=count;i<nums.length;i++){
        //     nums[i]=999;
        // }
        // return j;
        int k = 0; 
     for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i]; 
                k++;               
            }
        }
        
        return k;
    }
}