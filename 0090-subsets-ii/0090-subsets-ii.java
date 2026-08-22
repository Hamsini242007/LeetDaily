class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans= new ArrayList<>();   
        List<Integer> sub= new ArrayList<>();
        Arrays.sort(nums);
        ans.add(new ArrayList<>());
        powerSet(nums,sub,ans,0);
        return ans;  
    }
    private void powerSet(int[] nums, List<Integer> sub, List<List<Integer>> ans, int index){
        if(index>nums.length) return;
        for(int i=index;i<nums.length;i++){
            sub.add(nums[i]);
            if(!ans.contains(sub)){
                ans.add(new ArrayList<>(sub));
            }
            powerSet(nums,sub,ans,i+1);
            sub.remove(sub.size()-1);
        }
    }
}