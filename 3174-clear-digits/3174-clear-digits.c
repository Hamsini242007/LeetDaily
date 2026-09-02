char* clearDigits(char* s) {
    int len=strlen(s);
    char* stack=(char*)malloc((len+1)*sizeof(char));
    if(stack==NULL) return NULL;
    int top=-1;
    for(int i=0;i<len;i++){
        if(isdigit(s[i])) top--;
        else stack[++top]=s[i];
    }
    stack[++top]='\0';
    return stack;
}
//can use 2 pointer approach