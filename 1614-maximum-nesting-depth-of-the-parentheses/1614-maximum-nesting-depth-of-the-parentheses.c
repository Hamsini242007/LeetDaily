int maxDepth(char* s) {
    int count =0,max=0;
    while(*s){
        if(*s=='('){
            count++;
            max=(count>max)?count:max;
        }else if(*s==')') count--;
        s++;
    }
    return max;
}