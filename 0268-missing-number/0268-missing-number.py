class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        large = len(nums)
        return ((large*(large+1))//2) - sum(nums)
    