class Solution {
public:
    int deleteGreatestValue(vector<vector<int>>& grid) {

        int r = grid.size();
        int c = grid[0].size();

        for(int i=0;i<r;i++){
            sort(grid[i].begin(),grid[i].end(), greater<int>());
        }

        int ans = 0;
        
        for(int i=0;i<c;i++){
            int maxi = grid[0][i];
            for(int j=0;j<r;j++){
                maxi = max(maxi,grid[j][i]);
            }
            ans+=maxi;
        }
        
        return ans;
    }
};