class Solution:
    def minPathSum(self, grid: List[List[int]]) -> int:
        r,c=len(grid),len(grid[0])
        dp=[[0 for i in range(c)] for j in range(r)]
        dp[0][0]=grid[0][0]
        for i in range(r):
            for j in range(c):
                if i==0 and j==0:
                    continue
                top = float("inf") if i==0 else dp[i-1][j]
                left = float("inf") if j==0 else dp[i][j-1]
                
                dp[i][j]+=grid[i][j]+min(
                    top,left)
        return dp[r-1][c-1]


        