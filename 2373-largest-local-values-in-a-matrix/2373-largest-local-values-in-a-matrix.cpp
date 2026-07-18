class Solution {
public:
    vector<vector<int>> largestLocal(vector<vector<int>>& grid) {
        vector<vector<int>> ans;
        int r = grid.size();
        int c = grid[0].size();

        for(int i=0;i<r-2;i++){
            vector<int> temp;
            
            for(int j=0;j<c-2;j++){
                int maxi = grid[i][j];
                maxi = max(maxi,grid[i][j+1]);
                maxi = max(maxi,grid[i][j+2]);
                maxi = max(maxi,grid[i+1][j]);
                maxi = max(maxi,grid[i+1][j+1]);
                maxi = max(maxi,grid[i+1][j+2]);
                maxi = max(maxi,grid[i+2][j]);
                maxi = max(maxi,grid[i+2][j+1]);
                maxi = max(maxi,grid[i+2][j+2]);

                temp.push_back(maxi);
            }

            ans.push_back(temp);
        }

        return ans;
    }
};