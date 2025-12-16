class Solution:
    def helper(self,r,c,m,n,dp):
        if(r==m-1 and c==n-1):
            return 1

        if dp[r][c] != -1:
            return dp[r][c]

        paths=0
        if(r<m-1):
            paths+=self.helper(r+1,c,m,n,dp)
        if(c<n-1):
            paths+=self.helper(r,c+1,m,n,dp)
        
        dp[r][c]=paths

        return paths
            
    def uniquePaths(self, m: int, n: int) -> int:
        dp=[[-1]*n for i in range(m)]
        return self.helper(0,0,m,n,dp)

        