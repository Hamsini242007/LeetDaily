class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans= new ArrayList<>();   
        List<Integer> sub= new ArrayList<>(nums.length);
        Arrays.sort(nums);
        powerSet(nums,sub,ans,0);
        return ans;  
    }
    private void powerSet(int[] nums, List<Integer> sub, List<List<Integer>> ans, int index){
        ans.add(new ArrayList<>(sub));
        for(int i=index;i<nums.length;i++){
            if(i>index && nums[i]==nums[i-1]) continue;
            sub.add(nums[i]);
            powerSet(nums,sub,ans,i+1);
            sub.remove(sub.size()-1);
        }
    }
}