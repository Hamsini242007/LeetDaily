class Solution {
    public int beautySum(String s) {
        int n=s.length(),totalBeauty=0;
        for(int i=0;i<n;i++){
            int[] freq=new int[26];
            for(int j=i;j<n;j++){
                freq[s.charAt(j)-'a']++;
                if(j-i+1<3) continue;
                int maxFreq=0, minFreq=Integer.MAX_VALUE;
                for(int k=0;k<26;k++){
                    if(freq[k]>0){
                        maxFreq=Math.max(maxFreq,freq[k]);
                        minFreq=Math.min(minFreq,freq[k]);
                    }
                }
                totalBeauty+=(maxFreq-minFreq);
            }
        }
        return totalBeauty;
    }
}