int maxDepth(char* s) {
    int count =0,max=0;
    for(int i=0;s[i]!='\0';i++){
        char ch=s[i];
        if(ch=='(') count++;
        else if(ch==')') count--;
        max=(count>max)?count:max;
    }
    return max;
}