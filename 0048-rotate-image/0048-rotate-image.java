class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        //int[][] transpose=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                //if(j>i){
                    int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
               // }
            }
        }
        for(int i=0;i<n;i++){
        int k=0,l=n-1;
        while(k<l){
            int temp=matrix[i][k];
            matrix[i][k]=matrix[i][l];
            matrix[i][l]=temp;
            k++;
            l--;
        }
        }
        
    }
}