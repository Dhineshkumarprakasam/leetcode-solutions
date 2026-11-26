class Solution {
    public int calculate(String s) {
        int number=0;
        int sign=1;
        int result = 0;

        Stack<Integer> stk = new Stack<>();

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);

            if(Character.isDigit(c)){
                number=number*10+(c-'0');
            }
            else if(c=='+'){
                result+=number*sign;
                number=0;
                sign=1;
            }
            else if(c=='-'){
                result+=number*sign;
                number=0;
                sign=-1;
            }
            else if(c=='('){
                result+=number*sign;
                stk.push(result);
                stk.push(sign);

                result=0;
                number=0;
                sign=1;
            }
            else if(c==')'){
                result+=number*sign;
                result*=stk.pop();
                result+=stk.pop();

                number=0;
                sign=1;
            }
        }

        result+=number*sign;
        return result;

    }
}