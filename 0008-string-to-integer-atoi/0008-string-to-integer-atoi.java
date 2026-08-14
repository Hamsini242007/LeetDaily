class Solution {
    public int myAtoi(String s) {
        // int ans=0,i=0,n=s.length(),sign=1;
        // while (i < n && s.charAt(i) == ' ') {
        //     i++;
        // }
        // if(i < n && s.charAt(i)=='-'){
        //     sign=-1;
        //     i++;
        // }else if(i < n && s.charAt(i)=='+'){
        //     i++;
        // }
        // while(i<n && Character.isDigit(s.charAt(i))){
        //     int dig=s.charAt(i)-'0';
        //     if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && dig > 7)) {
        //         return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        //     }
        //     ans=(ans*10)+dig;
        //     i++;
        // }
        // return ans*sign;

        return skipSpace(s,0);
    }
    private int skipSpace(String s, int index){
        if(index>=s.length()) return 0;

        if(s.charAt(index)==' ') return skipSpace(s,index+1);

        int sign =1;
        if(s.charAt(index)=='-'){
            sign=-1;
            index++;
        }else if(s.charAt(index)=='+'){
            index++;
        }
        return parseDig(s,index,0,sign);
    }
    private int parseDig(String s, int index, int ans,int sign){
        if(index>=s.length() || !Character.isDigit(s.charAt(index))) return ans*sign;
        
        int dig=s.charAt(index)-'0';
        
        if(ans> Integer.MAX_VALUE/10 || (ans== Integer.MAX_VALUE/10 && dig>7)) return sign==1?Integer.MAX_VALUE:Integer.MIN_VALUE;

        return parseDig(s,index+1,(ans*10)+dig,sign);
    }
}