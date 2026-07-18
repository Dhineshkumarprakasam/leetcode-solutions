class Solution {
public:
    vector<vector<int>> construct2DArray(vector<int>& original, int m, int n) {
        int length = original.size();
        vector<vector<int>> ans;

        if((m*n)!=length)
            return ans;

        int e=0;
        for(int i=0;i<m;i++){
            vector<int> temp;
            for(int j=0;j<n;j++)
                temp.push_back(original[e++]);
            ans.push_back(temp);
        }
        return ans;
    }
};