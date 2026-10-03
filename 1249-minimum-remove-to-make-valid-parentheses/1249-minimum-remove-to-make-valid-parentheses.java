class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> stk = new Stack<>();
        StringBuilder sb = new StringBuilder(s);

        for(int i=0;i<sb.length();i++){
            char c = sb.charAt(i);
            if(c=='(')
                stk.push(i);
            else if(c==')'){
                if(!stk.isEmpty())
                    stk.pop();
                else
                    sb.setCharAt(i,'*');
            }
        }

        while(!stk.isEmpty()){
            sb.setCharAt(stk.pop(),'*');
        }

        StringBuilder res = new StringBuilder();
        for(int i=0;i<sb.length();i++)
            if(sb.charAt(i)!='*')
                res.append(sb.charAt(i));
        return res.toString();
    }
}