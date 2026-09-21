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
            stk.pop();
            k--;
        }
        
        StringBuilder ans = new StringBuilder();
        for(char i : stk)
            ans.append(i);
        
        while(ans.length()>0 && ans.charAt(0)=='0')
            ans.deleteCharAt(0);
        
        if(ans.length()==0)
            return "0";
        return ans.toString();
    }
}