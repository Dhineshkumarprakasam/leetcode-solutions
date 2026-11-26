class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stk = new Stack<>();

        for(String i : tokens){
            if(i.equals("+")){
                int p1 = stk.pop();
                int p2 = stk.pop();
                stk.push(p2+p1);
            }
            else if(i.equals("-")){
                int p1 = stk.pop();
                int p2 = stk.pop();
                stk.push(p2-p1);
            }
            else if(i.equals("*")){
                int p1 = stk.pop();
                int p2 = stk.pop();
                stk.push(p2*p1);
            }
            else if(i.equals("/")){
                int p1 = stk.pop();
                int p2 = stk.pop();
                stk.push(p2/p1);
            }
            else{
                stk.push(Integer.parseInt(i));
            }
        }
        return stk.peek();
    }
}