class Solution {
    public List<Integer> getRow(int rowIndex) {
        // List<List<Integer>> arr=new ArrayList<>();
        // for(int i=0;i<=rowIndex;i++){
        //     List<Integer> row = new ArrayList<>();
        //     for(int j=0;j<=i;j++){
        //         if(j==0||j==i){
        //             row.add(1);
        //         }else{
        //             int val = arr.get(i - 1).get(j - 1) + arr.get(8i - 1).get(j);
        //             row.add(val);
        //         }
        //     }
        //     arr.add(row);
        // }
        // return arr.get(rowIndex);
        List<Integer> ans=new ArrayList<>();
        long curr=1;
        int n=rowIndex+1;
        ans.add(1);
        for(int i=1;i<=rowIndex;i++){
            curr=curr*(n-i)/i;
            ans.add((int) curr);
        }
        return ans;
    }
}