class Solution {
    public double myPow(double x, int n) {
        long N=n;
        //double ans=1;
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

        //return power(x,N,ans);
        return fastPow(x,N);
    }
    // private double power(double x, long N,double ans){
    //     if(N<=0) return ans;
    //     if(N%2==1){
    //             ans*=x;
    //     }
    //     return power(x*x,N/2,ans);
    // }
    private double fastPow(double x, long N) {
        if (N == 0) return 1.0;

        double half = fastPow(x, N / 2);

        if (N % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }
}