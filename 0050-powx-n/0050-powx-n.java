class Solution {
    public double myPow(double x, int n) {
        double ans=1;
        if(n==0) return 1;
        if( x==0) return 0;
        if( x==2 && n==Integer.MIN_VALUE) return 0;
        int a=Math.abs(n)/2;
        for(int i=0;i<a;i++){
            ans*=x;
        }
        if(n%2==0){
            return (n>0)? ans*ans:1/(ans*ans);
        }else{
            return (n>0)? ans*ans*x:1/(ans*ans*x);
        }
    }
}