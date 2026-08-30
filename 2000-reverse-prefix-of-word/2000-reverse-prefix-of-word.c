char* reversePrefix(char* word, char ch) {
    int top=-1;
    char rev[strlen(word)];
    // char* rev=(char*)malloc(len*sizeof(char));
    // if(rev==NULL) return NULL;
    for(int i=0;word[i]!='\0';i++){
        rev[++top]=word[i];
        if(word[i]==ch){
            for(int j=0;j<i+1;j++){
                word[j]=rev[top--];
            }
            break;
        }
    }
    return word; 
}