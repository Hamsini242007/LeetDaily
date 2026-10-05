int scoreOfParentheses(char* s) {
    int depth=0,i=0,ans=0,temp=0;
    while(s[i]!='\0'){
        if(s[i]=='(') depth++;
        if(s[i]==')'){
            if(s[i-1]=='('){
                temp=depth-1;
                ans+=pow(2,temp);
            }
            depth--; 
        }
        i++;
    }
    return ans;
}