class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length==0|| nums==null){
            return 0;
        }
        if(nums.length==1){
            return nums[0];
        }
        int product=nums[0],max=nums[0],min=nums[0];
        for(int i=1;i<nums.length;i++){
            int cur=nums[i];
            int m=max*nums[i];
            int n=min*nums[i];
            max=Math.max(cur, Math.max(m, n));
            min=Math.min(cur, Math.min(m, n));
            product=Math.max(max,product);
        }
        return product;
    }
}
// class Solution {
//     public int maxProduct(int[] nums) {

//         int max = nums[0];
//         int temp = 1;

//         for (int i = 0; i < nums.length; i++) {
//             temp *= nums[i];
//             max = Math.max(temp, max);
//             if (temp == 0) {
//                 temp = 1;
//             }
//         }
        
//         temp = 1;
//         for (int i = nums.length - 1; i >= 0; i--) {
//             temp *= nums[i];
//             max = Math.max(temp, max);
//             if (temp == 0) {
//                 temp = 1;
//             }
//         }
        
//         return max;
//     }

//     // 2, 3, -2, 0, 4, -1, -1
// }