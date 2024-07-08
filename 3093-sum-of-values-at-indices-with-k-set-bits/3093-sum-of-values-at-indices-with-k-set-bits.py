class Solution:
    def sumIndicesWithKSetBits(self, nums: List[int], k: int) -> int:
        value=0
        for i in range(0,len(nums)):
            answer=bin(i)
            if answer.count('1')==k:
                value+=nums[i]
        return value
        