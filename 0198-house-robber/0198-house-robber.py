class Solution:
    def f(self,nums,i,dp):
        if i>=len(nums):
            return 0
        
        if dp[i]!=-1:
            return dp[i]
        
        dp[i]= max(nums[i]+self.f(nums,i+2,dp),self.f(nums,i+1,dp))
        return dp[i]

    def rob(self, nums: List[int]) -> int:
        dp=[-1]*(len(nums)+1)
        if len(nums)>1:
            return max(self.f(nums,0,dp),self.f(nums,1,dp))
        else:
            return nums[0]
        