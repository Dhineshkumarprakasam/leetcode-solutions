class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> stk = new Stack<>();
        Stack<Integer> star = new Stack<>();

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='(')
                stk.push(i);
            else if(c=='*')
                star.push(i);
            else if(c==')'){
                if(!stk.isEmpty())
                    stk.pop();
                else if(!star.isEmpty())
                    star.pop();
                else
                    return false;
            }
        }

        while(!stk.isEmpty() && !star.isEmpty()){
            if(stk.peek()<star.peek()){
                stk.pop();
                star.pop();
            }
            else{
                return false;
            }
        }

        return stk.isEmpty();
    }
}