class Solution {
    public String longestCommonPrefix(String[] strs) {
    //     String o="";
    //    Arrays.sort(strs);
       
    //     String s1=strs[0];
    //     String s2=strs[strs.length-1];
    //     for(int j=0;j<Math.min(s1.length(),s2.length());j++){
    //         if(s1.charAt(j)==s2.charAt(j)){
    //             o+=s1.charAt(j);
    //         }
    //         else{
    //             break;
    //         }
    //     }
       
    //    return o;

    if (strs == null || strs.length == 0) return "";
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i == strs[j].length() || strs[j].charAt(i) != c) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }
}