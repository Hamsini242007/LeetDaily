int scoreOfParentheses(char* s) {
    int depth=0,i=0,ans=0;
    while(s[i]!='\0'){
        if(s[i]=='('){
            depth++;
        }else{
            depth--; 
            if(s[i-1]=='('){
                ans+=pow(2,depth);
            }
        }
        i++;
    }
    return ans;
}