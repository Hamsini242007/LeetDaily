class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        if(s==null || n<1) return "";
        int start=0,end=0,len1=0,len2=0,maxLen=0;
        for(int i=0;i<n;i++){
            len1=expand(s,i,i);
            len2=expand(s,i,i+1);
            maxLen = Math.max(len1, len2);
            if(maxLen> end-start){
                start=i - (maxLen - 1) / 2;
                end=i + maxLen / 2;
            }
            
        }
        return s.substring(start,end+1);
    }
    private int expand(String s, int left,int right){
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        //len=(right-1)-(left+1)+1
        return right-left-1;
    }
}