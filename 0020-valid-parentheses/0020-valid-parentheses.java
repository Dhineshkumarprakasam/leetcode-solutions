class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();

        for(char i : s.toCharArray()){
            if(i=='(' || i=='[' || i=='{')
                stk.push(i);
            
            else{
                if(stk.isEmpty())
                    return false;
                
                char p = stk.peek();
                if((p=='(' && i==')') || (p=='[' && i==']') || (p=='{' && i=='}'))
                    stk.pop();
                else{
                    return false;
                }
            }
        }

        if(stk.isEmpty())
            return true;
        return false;
    }
}