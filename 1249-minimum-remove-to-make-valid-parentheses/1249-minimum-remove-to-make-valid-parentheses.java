class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> stk = new Stack<>();
        StringBuffer sb = new StringBuffer(s);

        for(int i=0;i<sb.length();i++){
            char c = sb.charAt(i);
            if(c=='(')
                stk.push(i);
            else if(!stk.isEmpty() && c==')')
                stk.pop();
            else if(c==')'){
                sb.setCharAt(i,'*');
            }
        }

        
        while(!stk.isEmpty()){
            sb.setCharAt(stk.pop(),'*');
        }
        
        StringBuffer ans = new StringBuffer();
        for(char i : sb.toString().toCharArray())
            if(i!='*')
                ans.append(i);
        
        return ans.toString();
    }
}