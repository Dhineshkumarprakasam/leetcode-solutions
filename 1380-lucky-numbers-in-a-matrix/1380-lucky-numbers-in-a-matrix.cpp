class Solution {
public:
    vector<int> luckyNumbers(vector<vector<int>>& matrix) {
        int r = matrix.size();
        int c = matrix[0].size();
        vector<int> ans;
        set<int> row;
        set<int> column;
        
        for(int i=0;i<r;i++){
            int mini = matrix[i][0];
            for(int j=0;j<c;j++)
                mini = min(mini,matrix[i][j]);
            row.insert(mini);
        }

        for(int i=0;i<c;i++){
            int maxi = matrix[0][i];
            for(int j=0;j<r;j++)
                maxi = max(maxi,matrix[j][i]);
            column.insert(maxi);
        }

        for(int i : row){
            if(column.find(i)!=column.end())
                ans.push_back(i);
        }

        return ans;
    }
};