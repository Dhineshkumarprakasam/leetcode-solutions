class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> stk = new Stack<Integer>();
        int second,first,ans;
        for(String i : tokens){
            if(i.matches("^[+-]?[0-9]+")){
                stk.push(Integer.parseInt(i));
            }
            else{
                first = stk.pop();
                second = stk.pop();
                if(i.equals("*"))
                    ans = second*first;
                else if(i.equals("/"))
                    ans= second/first;
                else if(i.equals("+"))
                    ans=second+first;
                else
                    ans=second-first;
                stk.push(ans);
            }
        }

        return stk.pop();
    }
}