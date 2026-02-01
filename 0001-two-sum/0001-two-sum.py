class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        d=dict()
        for i in range(len(nums)):
            val = target-nums[i]
            if val in d:
                return [i,d[val]]
            d[nums[i]]=i
        return [-1,-1]
            