char* clearDigits(char* s) {
    int len=strlen(s);
    char* stack=(char*)malloc((len+1)*sizeof(char));
    if(stack==NULL) return NULL;
    int top=-1;
    for(int i=0;i<len;i++){
        if(isdigit(s[i])) top=(top>=0)?top-1:top;
        else stack[++top]=s[i];
    }
    stack[++top]='\0';
    return stack;
}