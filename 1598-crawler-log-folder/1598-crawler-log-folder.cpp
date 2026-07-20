class Solution {
public:
    int minOperations(vector<string>& logs) {
        stack<string> stk;
        for(string i : logs){
            if(i=="../" && !stk.empty())
                stk.pop();
            if(i!="./" && i!="../")
                stk.push(i);
        }

        int count=0;
        while(!stk.empty()){
            stk.pop();
            count++;
        }
        return count;
    }
};