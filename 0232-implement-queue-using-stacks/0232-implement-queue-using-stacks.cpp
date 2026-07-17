class MyQueue {
public:
    stack<int> queue;
    stack<int> temp;

    MyQueue() {}
    
    void push(int x) {
        if(queue.empty())
            queue.push(x);
        else{
            while(!queue.empty()){
                int ele = queue.top();
                queue.pop();
                temp.push(ele);
            }

            queue.push(x);

            while(!temp.empty()){
                int ele = temp.top();
                temp.pop();
                queue.push(ele);
            }
        }
    }
    
    int pop() {
        int ele = queue.top();
        queue.pop();
        return ele;
    }
    
    int peek() {
        return queue.top();
    }
    
    bool empty() {
        return queue.empty();
    }
};

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue* obj = new MyQueue();
 * obj->push(x);
 * int param_2 = obj->pop();
 * int param_3 = obj->peek();
 * bool param_4 = obj->empty();
 */