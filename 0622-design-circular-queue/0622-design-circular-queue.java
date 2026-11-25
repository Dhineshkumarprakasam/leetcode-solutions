class MyCircularQueue {
    int q[];
    int n,front,rear;
    public MyCircularQueue(int k) {
        n=k;
        q=new int[k];
        front=-1;
        rear=-1;
    }
    
    public boolean enQueue(int value) {
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
    
    public boolean deQueue() {
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
    
    public int Front() {
        if(front==-1)
            return -1;
        return q[front];
    }
    
    public int Rear() {
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
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */