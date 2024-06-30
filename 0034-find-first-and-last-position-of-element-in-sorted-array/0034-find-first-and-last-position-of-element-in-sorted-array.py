class Solution:
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        if target in nums:
            a=nums.index(target)
            return [a,a+nums.count(target)-1]
        else:
            return [-1,-1]
        