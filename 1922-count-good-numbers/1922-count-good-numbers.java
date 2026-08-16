class Solution {
    public int countGoodNumbers(long n) {
        long evePow=(n+1)/2, oddPow=n/2,base=0,ans=1,mod=1000000007;
        base=5;
        while(evePow>0){
            if(evePow%2==1){
                ans=(ans*base)%mod;
            }
            base=(base*base)%mod;
            evePow/=2;
        }
        base=4;
        while(oddPow>0){
            if(oddPow%2==1){
                ans=(ans*base)%mod;
            }
            base=(base*base)%mod;
            oddPow/=2;
        }
        return (int)ans;
    }
}