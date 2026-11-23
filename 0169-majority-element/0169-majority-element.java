class Solution {
    public int majorityElement(int[] nums) {
        // int count=0;
        // int a=0;
        // for(int num :nums){
        //     if(count==0)
        //         a=num;
        // if(num==a){
        //     count++;
        // }else{
        //     count--;
        // }
        // }
        // return a;
        // THERE'S ANOTHER METHOD USING BITS
        int n=nums.length;
        Arrays.sort(nums);
        return nums[n/2];
    }
}