class Solution:
    def helper(self,amount,coins,dp):
        if amount==0:
            return 0
        
        if amount<0:
            return -1

        if amount in dp:
            return dp.get(amount)
        
        mini = float('inf')
        for i in coins:
            sub = self.helper(amount-i,coins,dp)
            if sub!=-1:
                mini = min(mini,sub+1)
        if mini == float('inf'):
            dp[amount]=-1
        else:
            dp[amount]=mini

        return dp[amount]
        
    def coinChange(self, coins: List[int], amount: int) -> int:
        dp = dict()
        return self.helper(amount,coins,dp)
        