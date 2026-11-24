class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        // int[] temp= new int[n];
        // for(int i=0;i<n;i++){
        //     temp[(i+k)%n]=nums[i];
        // }
        // System.arraycopy(temp,0,nums,0,n);
        k=k%n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    }
     void reverse(int[] nums,int start,int end){
            int temp=0;
            while(start<end){
                temp=nums[start];
                nums[start++]=nums[end];
                nums[end--]=temp;
            }
        }
}
//CHECKKKKKK
// Integer[] arr = {1, 2, 3, 4, 5};
//         List<Integer> list = Arrays.asList(arr);
        
//         Collections.rotate(list, 2); // Rotates right by 2
//         System.out.println(list); // Output: [4, 5, 1, 2, 3