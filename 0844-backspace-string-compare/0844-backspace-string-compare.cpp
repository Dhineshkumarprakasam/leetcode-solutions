class Solution {
public:
    bool backspaceCompare(string s, string t) {
        stack<char> stk1;
        stack<char> stk2;
        for(char i : s)
            if(i=='#' && !stk1.empty())
                stk1.pop();
            else{
                if(i!='#')
                    stk1.push(i);
            }
            
        
        for(char i : t)
            if(i=='#' && !stk2.empty())
                stk2.pop();
            else{
                if(i!='#')
                    stk2.push(i);
            }

        string str1="";
        string str2="";
        while(!stk1.empty()){
            str1+=stk1.top();
            stk1.pop();
        }
        while(!stk2.empty()){
            str2+=stk2.top();
            stk2.pop();
        }
        
        cout<<str1<<" : "<<str2;
        if(str1==str2)
            return true;
        return false;
    }
};