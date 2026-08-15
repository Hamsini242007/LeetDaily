class Solution {
    public double myPow(double x, int n) {
        long N=n;
        double ans=1;
        if(n<0){
            x=1/x;
            N=-N;
        }
        // while(N>0){
        //     if(N%2==1){
        //         ans*=x;
        //     }
        //     x*=x;
        //     N/=2;
        // }
        // return ans;
        return power(x,N,ans);
    }
    private double power(double x, long N,double ans){
        if(N<=0) return ans;
        if(N%2==1){
                ans*=x;
        }
        return power(x*x,N/2,ans);
    }
}