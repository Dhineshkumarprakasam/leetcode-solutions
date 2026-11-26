class Solution {
    public int calculate(String s) {
        Stack<Integer> stk = new Stack<>();

        int result=0;
        int number=0;
        int sign=1;

        for(char i : s.toCharArray()){
            if(i=='+'){
                result+=number*sign;
                sign=1;
                number=0;
            }
            else if(i=='-'){
                result+=number*sign;
                sign=-1;
                number=0;
            }

            else if(Character.isDigit(i)){
                number=(number*10)+(i-'0');
            }

            else if(i=='('){
                stk.push(result);
                stk.push(sign);
                result=0;
                sign=1;
                number=0;
            }

            else if(i==')'){
                result+=number*sign;
                result*=stk.pop();
                result+=stk.pop();
                number=0;
            }
        }

        result+=number*sign;

        return result;

    }
}