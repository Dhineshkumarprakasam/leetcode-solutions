class MyCircularDeque {
    int q[];
    int n,front,rear;

    public MyCircularDeque(int k) {
        q= new int[k];
        n=k;
        front=-1;
        rear=-1;
    }
    
    public boolean insertFront(int value) {
        if(front==-1){
            front++;
            q[++rear]=value;
        }
        else if((front-1+n)%n==rear)
            return false;
        else{
            front=(front-1+n)%n;
            q[front]=value;
        }
        return true;
    }
    
    public boolean insertLast(int value) {
        if(front==-1){
            front++;
            q[++rear]=value;
        }
        else if((rear+1)%n==front)
            return false;
        else{
            rear=(rear+1)%n;
            q[rear]=value;
        }
        return true;
    }
    
    public boolean deleteFront() {
        if(front==-1)
            return false;
        else if(front==rear){
            front=-1;
            rear=-1;
        }
        else{
            front=(front+1)%n;
        }
        return true;
    }
    
    public boolean deleteLast() {
        if(front==-1)
            return false;
        else if(front==rear){
            front=-1;
            rear=-1;
        }
        else{
            rear=(rear-1+n)%n;
        }
        return true;
    }
    
    public int getFront() {
        if(front==-1)
            return -1;
        return q[front];
    }
    
    public int getRear() {
        if(front==-1)
            return -1;
        return q[rear];
    }
    
    public boolean isEmpty() {
        if(front==-1)
            return true;
        return false;
    }
    
    public boolean isFull() {
        if((rear+1)%n==front)
            return true;
        return false;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */