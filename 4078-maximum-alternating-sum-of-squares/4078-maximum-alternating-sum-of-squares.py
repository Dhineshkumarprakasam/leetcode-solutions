class Solution:
    def maxAlternatingSum(self, nums: List[int]) -> int:
        nums = [abs(x) for x in nums]
        nums.sort()

        l = len(nums)//2
        min_arr = nums[:l]
        max_arr =nums[l:]

        ans=0
        for i in max_arr:
            ans+=(i*i)

        for i in min_arr:
            ans-=(i*i)
        
        return ans 
            