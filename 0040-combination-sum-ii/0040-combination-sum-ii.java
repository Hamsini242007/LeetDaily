class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> arr=new ArrayList<>();
        Arrays.sort(candidates);
        tracker(candidates,target,arr,ans,0);
        return ans;
    }
    private void tracker(int[] candidates, int target, List<Integer> arr, List<List<Integer>> ans,int index){
        if(target==0){
            ans.add(new ArrayList<>(arr));
            return;
        }
        if(target<0) return;
        for(int i=index;i<candidates.length;i++){
            if(candidates[i]>target) break;
            if(i>index && candidates[i]==candidates[i-1]) continue;
            arr.add(candidates[i]);
            tracker(candidates,target-candidates[i],arr,ans,i+1);
            arr.remove(arr.size()-1);
        }
        
    }
}