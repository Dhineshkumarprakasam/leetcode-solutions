class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> stk = new Stack<>();
        for(int i=0;i<num.length();i++){
            while(!stk.isEmpty() && k>0 && stk.peek()>num.charAt(i)){
                stk.pop();
                k--;
            }
            stk.push(num.charAt(i));
        }

        while(k>0 && !stk.isEmpty()){
            k--;
            stk.pop();
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<stk.size();i++){
            sb.append(stk.get(i));
        }

        while(sb.length()>0 && sb.charAt(0)=='0')
            sb.deleteCharAt(0);
        
        if(sb.length()>0)
            return sb.toString();
        return "0";
    }
}