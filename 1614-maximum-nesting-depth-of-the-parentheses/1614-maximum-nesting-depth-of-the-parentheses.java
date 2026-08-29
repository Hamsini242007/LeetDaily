class Solution {
    public int maxDepth(String s) {
        int count=0,max=0;
        // for(int i=0;i<s.length();i++){
        //     if(s.charAt(i)=='('){
        //         count++;
        //         max=Math.max(max,count);
        //     }else if(s.charAt(i)==')'){
        //         count--;
        //     }
        // }
        for (char c : s.toCharArray()) {
            if (c == '(') {
                count++;
                max = Math.max(max, count);
            } else if (c == ')') {
                count--;
            }
        }
        return max;
    }
}