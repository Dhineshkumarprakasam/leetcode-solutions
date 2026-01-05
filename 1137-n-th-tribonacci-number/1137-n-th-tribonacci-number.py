class Solution:
    def f(self,n,dp):
        if n<=1:
            return n
        if n==2:
            return 1
            
        if dp[n]!=-1:
            return dp[n]
        
        dp[n]=self.f(n-1,dp)+self.f(n-2,dp)+self.f(n-3,dp)
        return dp[n]
        
    def tribonacci(self, n: int) -> int:
        if n<=1:
            return n
        if n==2:
            return 1

        dp=[-1]*(n+1)
        dp[0]=0
        dp[1]=1
        dp[2]=2
        return self.f(n,dp)
        