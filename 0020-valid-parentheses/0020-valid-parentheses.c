bool isValid(char* s) {
    int len=strlen(s);
    if (len % 2 != 0) return false;
    char stack[len];
    int top=-1;
    for(int i=0;i<len;i++){
        char ch=s[i];
        if(ch=='(' || ch=='[' || ch=='{'){
            stack[++top]=ch;
        }else{
            if(top==-1) return false;
           char open=stack[top--];
            if((open=='(' && ch!=')')||(open=='[' && ch !=']')||(open=='{' && ch !='}')){
                return false;
            }
        }
    }
    return top==-1;
}