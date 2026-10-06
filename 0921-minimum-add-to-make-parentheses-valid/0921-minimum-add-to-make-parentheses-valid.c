int minAddToMakeValid(char* s) {
    int i=0,count=0,top=-1;
    char stack[strlen(s)];
    while(s[i]!='\0'){
        char ch =s[i];
        stack[++top]=ch;
        if(top>0 && stack[top-1]=='(' && ch==')'){
            top-=2;
        }
        i++;
    }
    return top+1;
}