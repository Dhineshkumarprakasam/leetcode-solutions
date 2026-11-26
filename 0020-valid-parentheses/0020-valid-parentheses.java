class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();

        for(char c : s.toCharArray()){
            if(c=='(' || c=='{' || c=='[')
                stk.push(c);
            else if(!stk.isEmpty() && stk.peek().equals('(') && c==')')
                stk.pop();
            else if(!stk.isEmpty() && stk.peek().equals('[') && c==']')
                stk.pop();
            else if(!stk.isEmpty() && stk.peek().equals('{') && c=='}')
                stk.pop();
            else{
                return false;
            }
        }

        return stk.isEmpty();
    }
}