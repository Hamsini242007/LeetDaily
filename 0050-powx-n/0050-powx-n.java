class Solution {
    public double myPow(double x, int n) {
        if(n==0) return 1;
        if( x==0) return 0;
        long N=n;
        long half=Math.abs(N/2);
        double ans=1,currProduct=x;
        while(half>0){
            if(half%2==1){
                ans*=currProduct;
            }
            currProduct*=currProduct;
            half/=2;
        }
        if(n%2==0){
            return (n>0)? ans*ans:1/(ans*ans);
        }else{
            return (n>0)? ans*ans*x:1/(ans*ans*x);
        }
    }
}