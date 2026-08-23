class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans =new ArrayList<>();
        List<Integer> arr=new ArrayList<>(k);
        combination(k,n,ans,arr,1);
        return ans;
    }
    private void combination(int k, int target, List<List<Integer>> ans, List<Integer> arr, int index){
        if(arr.size()==k){
            if(target==0){
                ans.add(new ArrayList<>(arr));
            }
            return;
        }
        // using i<=maxIndex instead of i<10
        int maxIndex=9-(k-arr.size())+1;
        for(int i=index;i<=maxIndex;i++){
            if(i>target) break;
            arr.add(i);
            combination(k,target-i,ans,arr,i+1);
            arr.remove(arr.size()-1);
        }
    }
        /*
        if arr.size() is far from k and there aren't enough remaining numbers left in the loop (from index to 9),
        your code will still make redundant recursive calls.
        For example, if k = 5 and arr.size() = 1, but index = 7, you only have numbers 
        {7, 8, 9} (3 numbers) remaining, but you need 4 more numbers to reach $k=5$.
        The search is guaranteed to fail, yet the recursion proceeds.
        */
}