class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans =new ArrayList<>();
        List<Integer> arr=new ArrayList<>(k);
        combination(k, n, ans, arr, 1);
        return ans;
    }
    private void combination(int k, int target, List<List<Integer>> ans, List<Integer> arr, int index){
        if(arr.size()==k){
            if(target==0){
                ans.add(new ArrayList<>(arr));
            }
            return;
        }
        for(int i=index;i<10;i++){
            if(i>target) break;
            arr.add(i);
            combination(k,target-i,ans,arr,i+1);
            arr.remove(arr.size()-1);
        }
    }
}