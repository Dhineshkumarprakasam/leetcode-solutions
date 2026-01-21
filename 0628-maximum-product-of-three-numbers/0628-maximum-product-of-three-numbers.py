class Solution:
    def maximumProduct(self, nums: List[int]) -> int:
        nums.sort()
        n=len(nums)
        
        p1 = nums[n-1]*nums[n-2]*nums[n-3]
        p2 = nums[0]*nums[1]*nums[n-1]
        return max(p1,p2)