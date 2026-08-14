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
        // while (i < n && Character.isDigit(s.charAt(i))) {
        //     int digit = s.charAt(i) - '0';

        //     // Check overflow before multiplying by 10
        //     if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && digit > 7)) {
        //         return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        //     }

        //     ans = (ans * 10) + digit;
        //     i++;
        // }
        // return ans*sign;

        int ans=0,i=0,n=s.length(),sign=1;
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }
        if(i < n && s.charAt(i)=='-'){
            sign=-1;
            i++;
        }else if(i < n && s.charAt(i)=='+'){
            i++;
        }
        while(i<n && Character.isDigit(s.charAt(i))){
            int dig=s.charAt(i)-'0';
            if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && dig > 7)) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            ans=(ans*10)+dig;
            i++;
        }
        return ans*sign;
    }
}