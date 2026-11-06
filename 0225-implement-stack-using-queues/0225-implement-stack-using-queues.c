


typedef struct {
    int q[8000];
    int front,rear;
} MyStack;


MyStack* myStackCreate() {
    MyStack* obj=(MyStack*)malloc(sizeof(MyStack));
    if(!obj) return NULL;
    obj->front=obj->rear=-1;
    return obj;
}

void myStackPush(MyStack* obj, int x) {
    if(obj->front==-1){
        obj->front=obj->rear=0;
        obj->q[obj->rear]=x;
        return;
    }
    int size= obj->rear-obj->front+1;
    obj->q[++(obj->rear)]=x;
    for(int i=0;i<size;i++){
        int val = obj->q[(obj->front)++];
        obj->q[++(obj->rear)]=val;
    }
}

bool myStackEmpty(MyStack* obj) {
    return obj->front==-1 || obj->front>obj->rear;
}

int myStackPop(MyStack* obj) {
    return obj->q[(obj->front)++];
}

int myStackTop(MyStack* obj) {
    return obj->q[(obj->front)];
}


void myStackFree(MyStack* obj) {
    free(obj);
}

/**
 * Your MyStack struct will be instantiated and called as such:
 * MyStack* obj = myStackCreate();
 * myStackPush(obj, x);
 
 * int param_2 = myStackPop(obj);
 
 * int param_3 = myStackTop(obj);
 
 * bool param_4 = myStackEmpty(obj);
 
 * myStackFree(obj);
*/