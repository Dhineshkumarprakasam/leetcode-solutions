class Solution {
public:
    int combination(int n, int r)
    {
        long long int result=1;

        for(int i=0;i<r;i++)
        {
            result=result*(n-i);
            result=result/(i+1);
        }
        return result;
    }
    vector<int> getRow(int rowIndex) {
        
        vector<int> ans;

        for(int c=1;c<=rowIndex+1;c++)
        {
            ans.push_back(combination(rowIndex,c-1));
        }
        return ans;
    }
};