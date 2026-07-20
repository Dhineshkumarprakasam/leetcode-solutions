class Solution {
public:
    string removeDuplicates(string s) {
        stack<char> stk;
        for(char i : s){
            if(stk.empty() || stk.top()!=i)
                stk.push(i);
            else
                stk.pop();
        }

        string ans="";
        while(!stk.empty()){
            ans+=stk.top();
            stk.pop();
        }
        reverse(ans.begin(),ans.end());
        return ans;
    }
};