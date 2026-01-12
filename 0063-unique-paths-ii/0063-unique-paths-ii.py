class Solution:
    def helper(self,r,c,grid,dp):
        if(grid[r][c]==1): return 0
        if(r==len(grid)-1 and c==len(grid[0])-1):
            return 1
        
        if dp[r][c]!=-1:
            return dp[r][c]

        path=0
        if(r<len(grid)-1):
            path+=self.helper(r+1,c,grid,dp)
        if(c<len(grid[0])-1):
            path+=self.helper(r,c+1,grid,dp)
        dp[r][c]=path
        return path

    def uniquePathsWithObstacles(self, obstacleGrid: List[List[int]]) -> int:
        if obstacleGrid[0][0] == 1:
            return 0

        dp=[[-1 for _ in range(len(obstacleGrid[0]))] for _ in range(len(obstacleGrid))]   
        return self.helper(0,0,obstacleGrid,dp)
    
        