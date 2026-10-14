char* maxSumOfSquares(int num, int sum) {
    int ans=0,k=0;
    char* str=(char*)malloc((num+1)*sizeof(char));
    if(str!=NULL){
        for(int i=0;i<num;i++){
            for(int j=9;j>=0;j--){
                ans+=j;
                if(ans<=sum){
                    str[k++]=(j+'0');
                    break;
                }
                ans-=j;
            }
        }
        str[k]='\0';
        if(ans!=sum) return "";
    }
    return str;
}