class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        total=sum(nums)
        large = len(nums)
        return ((large*(large+1))//2) - total
    