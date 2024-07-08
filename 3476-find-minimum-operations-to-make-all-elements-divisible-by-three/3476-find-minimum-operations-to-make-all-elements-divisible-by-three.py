class Solution:
    def minimumOperations(self, nums: List[int]) -> int:
        value=0
        for i in nums:
            if (i+1)%3==0 or (i-1)%3==0:
                value+=1
        return value