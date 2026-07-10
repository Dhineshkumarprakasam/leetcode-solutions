class Solution {
public:
    bool isSafe(vector<vector<int>> &grid, int cr,int cc, int r, int c){
        if(cr>=r || cc>=c || grid[cr][cc]==1)
            return false;
        else
            return true;
    }

    int countPaths(int cr,int cc, int r, int c, vector<vector<int>>& grid, vector<vector<int>> &dp){
        int left=0;
        int right=0;

        if(!isSafe(grid,cr,cc,r,c))
            return 0;

        if(cr==r-1 && cc==c-1){
            return 1;
        }

        if(dp[cr][cc]!=-1)
            return dp[cr][cc];

        //down
        if(isSafe(grid,cr+1,cc,r,c))
            left=countPaths(cr+1,cc,r,c,grid,dp);
        
        //right
        if(isSafe(grid,cr,cc+1,r,c))
            right=countPaths(cr,cc+1,r,c,grid,dp);
        
        dp[cr][cc]=left+right;
        return left+right;
    }

    int uniquePathsWithObstacles(vector<vector<int>>& obstacleGrid) {
        int r=obstacleGrid.size();
        int c=obstacleGrid[0].size();
        vector<vector<int>> dp(r,vector<int>(c,-1));
        return countPaths(0,0,r,c,obstacleGrid,dp);

    }
};