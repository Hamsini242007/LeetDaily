char* reversePrefix(char* word, char ch) {
    int len=strlen(word);
    int top=-1;
    char rev[len];
    // char* rev=(char*)malloc(len*sizeof(char));
    // if(rev==NULL) return NULL;

    for(int i=0;word[i]!='\0';i++){
        char l=word[i];
        rev[++top]=l;
        if(l==ch){
            for(int j=0;j<i+1;j++){
                word[j]=rev[top--];
            }
            break;
        }
    }
    return word; 
}