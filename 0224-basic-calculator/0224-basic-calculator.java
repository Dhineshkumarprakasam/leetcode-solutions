class Solution {
    public int calculate(String s) {
        int number=0;
        int sign = 1;
        int result = 0;
        Stack<Integer> stk = new Stack<>();

        for(char i : s.toCharArray()){
            if(Character.isDigit(i))
                number=number*10 + (i-'0');

            else if(i=='+'){
                result+=sign*number;
                sign=1;
                number=0;
            }

            else if(i=='-'){
                result+=sign*number;
                sign=-1;
                number=0;
            }

            else if(i=='('){
                stk.push(result);
                stk.push(sign);
                sign=1;
                result=0;
            }

            else if(i==')')
            {
                result+=sign*number;
                result*=stk.pop();
                result+=stk.pop();
                number=0;
            }
        }

        result+=sign*number;
        return result;
    }
}