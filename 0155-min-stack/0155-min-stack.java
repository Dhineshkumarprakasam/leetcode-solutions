class MinStack {
    Stack<Integer> min;
    Stack<Integer> stk;
    public MinStack() {
        min = new Stack<>();
        stk = new Stack<>();
    }
    
    public void push(int val) {
        stk.push(val);
        if(min.isEmpty() || min.peek()>=val)
            min.push(val);
    }
    
    public void pop() {
        if(stk.peek().equals(min.peek()))
            min.pop();
        stk.pop();
    }
    
    public int top() {
        return stk.peek();
    }
    
    public int getMin() {
       return min.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */