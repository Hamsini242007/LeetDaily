char* removeOuterParentheses(char* s) {
    int len=strlen(s);
    char* stack=(char*)malloc((len+1)*sizeof(char));
    if(stack==NULL) return NULL;
    int top=-1;
    int opened=0;
    for(int i=0;i<len;i++){
        char ch=s[i];
        if(ch=='('){
            if (opened>0) stack[++top]=ch;
            opened++;
        }else{
            opened--;
            if (opened>0) stack[++top]=ch;
        }
    }
    stack[++top]='\0';
    return stack;
}