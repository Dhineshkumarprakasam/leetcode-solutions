class Solution:
    def find(self,num,dp):
        if num==0:
            return 0
        
        if num in dp:
            return dp[num]
        
        mini=float("inf")
        for i in range(1,int(num**0.5)+1):
            sq=i*i
            ans = 1+self.find(num-sq,dp)
            mini = min(ans,mini)
        dp[num]=mini
        return dp[num]

    def numSquares(self, n: int) -> int:
        return self.find(n,dict())