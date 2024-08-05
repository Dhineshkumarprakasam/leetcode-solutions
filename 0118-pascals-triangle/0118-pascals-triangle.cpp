class Solution {
public:
    int combination(int n, int r)
    {
        int result=1;

        for(int i=0;i<r;i++)
        {
            result=result*(n-i);
            result=result/(i+1);
        }
        return result;
    }
    vector<vector<int>> generate(int numRows) {

        vector<vector<int>> ans;

        for(int r=1;r<=numRows;r++)
        {
            vector <int> p;

            for(int c=1;c<=r;c++)
            {
                p.push_back(combination(r-1,c-1));
            }
            ans.push_back(p);
        }
        return ans;
    }
};