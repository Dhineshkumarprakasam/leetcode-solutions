class MyStack {
public:
    queue<int> stk;
    queue<int> temp;
    MyStack() {
    }
    
    void push(int x) {
        if(stk.empty()){
            stk.push(x);
        }

        else{
            while(!stk.empty()){
                int ele = stk.front();
                stk.pop();
                temp.push(ele);
            }

            stk.push(x);

            while(!temp.empty()){
                int ele = temp.front();
                temp.pop();
                stk.push(ele);
            }
        }
    }
    
    int pop() {
        int ele = stk.front();
        stk.pop();
        return ele;
    }
    
    int top() {
        return stk.front();
    }
    
    bool empty() {
        if(stk.empty())
            return true;
        else
            return false;
    }
};

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack* obj = new MyStack();
 * obj->push(x);
 * int param_2 = obj->pop();
 * int param_3 = obj->top();
 * bool param_4 = obj->empty();
 */