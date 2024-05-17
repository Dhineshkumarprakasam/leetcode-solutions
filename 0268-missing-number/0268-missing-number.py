class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        n=len(nums)
        need=(n*(n+1))/2
        actual=0
        for i in nums:
            actual+=i
        return int(need-actual)