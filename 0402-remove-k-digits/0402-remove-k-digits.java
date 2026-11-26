class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> stk = new Stack<>();
        for(char i : num.toCharArray()){
            while(k>0 && !stk.isEmpty() && stk.peek()>i){
                stk.pop();
                k--;
            }

            stk.push(i);
        }

        while(k>0 && !stk.isEmpty()){
            stk.pop();
            k--;
        }

        StringBuffer ans = new StringBuffer();
        while(!stk.isEmpty()){
            ans.insert(0,stk.pop());
        }

        while(ans.length()>0 && ans.charAt(0)=='0'){
            ans.deleteCharAt(0);
        }

        if(ans.length()>0)
            return ans.toString();
        return "0";
    }
}