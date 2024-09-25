class Solution:
    
    def maximumGap(self, nums: List[int]) -> int:
        
        nums.sort()
        print(nums)
        gap=0
        for i in range(len(nums)-1):
            gap=max(gap,nums[i+1]-nums[i])
        return gap
