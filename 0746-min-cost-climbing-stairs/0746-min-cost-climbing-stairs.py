class Solution:
    def f(self,cost,i,dp):
        if i>=len(cost):
            return 0
        
        if dp[i]!=-1:
            return dp[i]
        
        dp[i]=cost[i]+min(self.f(cost,i+1,dp),self.f(cost,i+2,dp))
        return dp[i]

    def minCostClimbingStairs(self, cost: List[int]) -> int:
        dp=[-1]*(len(cost)+1)
        return min(self.f(cost,0,dp),self.f(cost,1,dp))
        