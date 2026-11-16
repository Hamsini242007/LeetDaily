class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0],maxp=0,n=prices.length;
        // if(prices==null||n<2)
        // return 0;
        for(int i=1;i<n;i++){
            if(min>prices[i]){
                min=prices[i];
            }else{
                maxp=Math.max(maxp,prices[i]-min);
            }
        }
        return maxp;
    }
}