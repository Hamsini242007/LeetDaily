class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        //String curr="";
        //alter(curr,0,0,n,ans);
        StringBuilder sb=new StringBuilder();
        alter(sb,0,0,n,ans);
        return ans;
    }
    private void alter(StringBuilder sb,int open,int close,int n,List<String> ans){
        if(sb.length()==2*n){
            ans.add(sb.toString());
            return;
        }
        if(open<n){
            sb.append('(');
            alter(sb,open+1,close,n,ans);
            sb.deleteCharAt(sb.length()-1);
        }
        if(close<open){
            sb.append(')');
            alter(sb,open,close+1,n,ans);
            sb.deleteCharAt(sb.length()-1);
        }
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