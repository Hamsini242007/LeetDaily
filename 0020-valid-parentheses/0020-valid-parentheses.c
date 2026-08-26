bool isValid(char* s) {
    if(strlen(s)<2) return false;
    char stack[10000];
    int top=-1;
    for(int i=0;s[i]!='\0';i++){
        char ch=s[i];
        if(ch=='(' || ch=='[' || ch=='{'){
            stack[++top]=ch;
        }else if(ch==')' || ch==']' || ch=='}'){
           // if(top==-1) return false;
            if((top==-1)||(stack[top] == '(' && ch !=')')||(stack[top] == '[' && ch !=']')||(stack[top] == '{' && ch !='}')){
                return false;
            }
            if(top!=-1){
                stack[top--];
            }else{
                return false;
            }
        }
    }
    if(top!=-1) return false;
    return true;
}