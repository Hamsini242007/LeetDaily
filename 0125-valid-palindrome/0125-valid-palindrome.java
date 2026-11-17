class Solution {
    public boolean isPalindrome(String s) {
        String ans=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        //String is time consuming
        char[] ca=ans.toCharArray();
        int n=ca.length;
        for(int i=n-1;i>=n/2;i--){
            if(ca[i]!=ca[n-1-i]){
                return false;
            }
        }
        return true;
    }
}