class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> stk = new Stack<Integer>();
        int second,first,ans;
        for(String i : tokens){
           if(i.equals("*")){
                first = stk.pop();
                second = stk.pop();
                ans=second*first;
                stk.push(ans);
           }
           else if(i.equals("/")){
                first = stk.pop();
                second = stk.pop();
                ans=second/first;
                stk.push(ans);
           }
           else if(i.equals("+")){
                first = stk.pop();
                second = stk.pop();
                ans=second+first;
                stk.push(ans);
           }
           else if(i.equals("-")){
                first = stk.pop();
                second = stk.pop();
                ans=second-first;
                stk.push(ans);
           }
           else{
                stk.push(Integer.parseInt(i));
           }
        }

        return stk.pop();
    }
}