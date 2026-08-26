class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int breaki=-1,value=0,idx2=0,idx1=0;;
        if(n<=1)return;
        for(int i=n-1;i>0;i--){
            if(nums[i]>nums[i-1]){
                breaki=i-1;
                idx1=breaki;
                value=nums[i-1];
                for(int j=n-1;j>breaki;j--){
                    if(nums[j]>value){
                        idx2=j;
                        break;
                    }
                }
                int temp=nums[idx1];
                nums[idx1]=nums[idx2];
                nums[idx2]=temp;
                Arrays.sort(nums,breaki+1,n);
                return;
            }
        }
         if(breaki==-1){
            Arrays.sort(nums);
         }
    }
}
// class Solution {
//     public void nextPermutation(int[] nums) {
//         int n = nums.length;
//         if (n <= 1) return;

//         // Step 1: Find the first decreasing element from the right
//         int i = n - 2;
//         while (i >= 0 && nums[i] >= nums[i + 1]) {
//             i--;
//         }

//         // Step 2: If a breakpoint was found, find its swap partner
//         if (i >= 0) {
//             int j = n - 1;
//             while (nums[j] <= nums[i]) {
//                 j--;
//             }
//             swap(nums, i, j);
//         }

//         // Step 3: Reverse everything after the breakpoint
//         reverse(nums, i + 1, n - 1);
//     }

//     // Helper method to keep main logic clean
//     private void swap(int[] nums, int i, int j) {
//         int temp = nums[i];
//         nums[i] = nums[j];
//         nums[j] = temp;
//     }

//     // Helper method to reverse a subarray in O(n)
//     private void reverse(int[] nums, int start, int end) {
//         while (start < end) {
//             swap(nums, start, end);
//             start++;
//             end--;
//         }
//     }
// }