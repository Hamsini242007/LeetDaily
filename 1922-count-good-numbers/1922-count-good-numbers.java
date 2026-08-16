class Solution {
    public int countGoodNumbers(long n) {
        long evePow=(n+1)/2, oddPow=n/2,mod=1000000007;
        // long ans=power(5,evePow,mod)*power(4,oddPow,mod)%mod;
        long ans=powerRecursive(5,evePow,mod)*powerRecursive(4,oddPow,mod)%mod;
        return (int)ans;

        // long evePow=(n+1)/2, oddPow=n/2,base=0,ans=1,mod=1000000007;
        // base=5;
        // while(evePow>0){
        //     if(evePow%2==1){
        //         ans=(ans*base)%mod;
        //     }
        //     base=(base*base)%mod;
        //     evePow/=2;
        // }
        // base=4;
        // while(oddPow>0){
        //     if(oddPow%2==1){
        //         ans=(ans*base)%mod;
        //     }
        //     base=(base*base)%mod;
        //     oddPow/=2;
        // }
        // return (int)ans;
    }
    private long power(long base,long expo,long mod){
        long ans=1;
        while(expo>0){
            if(expo%2==1){
                ans=(ans*base)%mod;
            }
            base=(base*base)%mod;
            expo/=2;
        }
        return ans;
    }

    private long powerRecursive(long base,long expo,long mod){
        if(expo==0) return 1;
        long half=powerRecursive(base,expo/2,mod);
        long result=half*half%mod;
        if(expo%2==1){
            result=result*base%mod;
        }
        return result;
    }
}