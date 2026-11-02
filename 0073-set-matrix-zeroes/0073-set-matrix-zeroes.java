class Solution {
    public void setZeroes(int[][] matrix) {
       int m=matrix.length,n =matrix[0].length;
       boolean[] r=new boolean[m];
       boolean[] c=new boolean[n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    r[i]=true;
                    c[j]=true;
                }
            }
        }
        for(int k=0;k<m;k++){
            for(int l=0;l<n;l++){
                if(r[k]||c[l]){
                    matrix[k][l]=0;
                }
            }
        }
                
    }
}