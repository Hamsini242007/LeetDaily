char* maxSumOfSquares(int num, int sum) {
    if(sum>9*num) return "";
    static char str[200001];
    for(int i=0;i<num;i++){
        for(int j=9;j>=0;j--){
            if(sum-j<=9*(num-1-i) && sum-j>=0){
                str[i]=(j+'0');
                sum-=j;
                break;
            }
        }
    }
    str[num]='\0';
    return str;
}