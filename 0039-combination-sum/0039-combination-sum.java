class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> arr=new ArrayList<>();
        int n=candidates.length;
        int total=target;
        selector(0,arr,total,n,ans,candidates);
        return ans;
    }
    private void selector(int index,List<Integer> arr,int total,int n,List<List<Integer>> ans,int[] candidates){
        if(total==0){
            ans.add(new ArrayList<>(arr));
            return;
        }
        if(total<0) return;

        for(int i=index;i<n;i++){
            arr.add(candidates[i]);
            selector(i,arr,total-candidates[i],n,ans,candidates);
            arr.remove(arr.size()-1);
            
        }
    }
}