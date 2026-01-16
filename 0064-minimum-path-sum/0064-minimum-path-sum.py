class Solution:
    def minPathSum(self, grid: List[List[int]]) -> int:
        dp=[[float("inf") for i in range(len(grid[0])+1)] for j in range(len(grid)+1)]
        dp[1][1]=grid[0][0]
        for i in range(1,len(grid)+1):
            for j in range(1,len(grid[0])+1):
                if i==1 and j==1:
                    continue
                dp[i][j]=grid[i-1][j-1]+min(dp[i-1][j],dp[i][j-1])
        return dp[len(grid)][len(grid[0])]


        