class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length,n=matrix[0].length,min=0,max=(m*n)-1;
        while(min<=max){
            int mid=min+(max-min)/2;
            int row=mid/n;
            int col=mid%n;
            if(target==matrix[row][col]){
                return true;
            }
            if(target<matrix[row][col]){
                max=mid-1;
            }else{
                min=mid+1;
            }
        }
        return false;
    }
}