class Solution {
public:
    int minAddToMakeValid(string s) {
        int ans=0;
        stack<char> stk;
        for(char i : s){
            if(i=='(')
                stk.push(i);
            else if(i==')' && !stk.empty() && stk.top()=='(')
                stk.pop();
            else if(stk.empty() && i==')')
                ans+=1;
        }

        while(!stk.empty())
        {
            stk.pop();
            ans+=1;
        }
        return ans;
    }
};