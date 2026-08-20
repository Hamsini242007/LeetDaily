class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> arr=new ArrayList<>();
        Arrays.sort(candidates);
        selector(0,arr,target,ans,candidates);
        return ans;
    }
    private void selector(int index,List<Integer> arr,int total,List<List<Integer>> ans,int[] candidates){
        if(total==0){
            ans.add(new ArrayList<>(arr));
            return;
        }
        if(total<0) return;

        for(int i=index;i<candidates.length;i++){
            if (candidates[i] > total) {
                break;
            }
            arr.add(candidates[i]);
            selector(i,arr,total-candidates[i],ans,candidates);
            arr.remove(arr.size()-1);
            
        }
    }
}