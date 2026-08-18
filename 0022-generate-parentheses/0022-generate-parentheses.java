class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        String curr="";
        alter(curr,0,0,n,ans);
        
        return ans;
    }
    private void alter(String curr,int open,int close,int n,List<String> ans){
        if(curr.length()==2*n){
            ans.add(curr);
            return;
        }
        if(open<n){
            alter(curr+"(",open+1,close,n,ans);
        }
        if(close<open){
            alter(curr+")",open,close+1,n,ans);
        }
    }
}