class Solution {
    public int countPrimes(int n) {
        if(n<=2) return 0;
        int count=0;
        boolean[] composite=new boolean[n];
        for(int i=2;i<n;i++){
            if(!composite[i]){
                count++;
                if((long)i*i<n){
                    for(int j=i*i;j<n;j+=i){
                        composite[j]=true;
                    }
                }
            }
        }
        // for(int i=2;i<n;i++){
        //     count++;
        //     for(int j=2;j*j<=i;j++){
        //         if(i%j==0){
        //             count--;
        //             break;
        //         }
        //     }
        // }
        return count;
    }
}