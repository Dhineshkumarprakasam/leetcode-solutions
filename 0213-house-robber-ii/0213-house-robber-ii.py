class Solution:
    def f(self,nums,i,dp):
        if i>=len(nums):
            return 0
        
        if dp[i]!=-1:
            return dp[i]
        
        dp[i]= max(nums[i]+self.f(nums,i+2,dp),self.f(nums,i+1,dp))
        return dp[i]

    def rob(self, nums: List[int]) -> int:
        l=len(nums)
        dp1=[-1]*(l+1)
        dp2=[-1]*(l+1)
        if len(nums)>1:
            return max(self.f(nums[0:l-1],0,dp1),self.f(nums[:l],1,dp2))
        else:
            return nums[0]
        