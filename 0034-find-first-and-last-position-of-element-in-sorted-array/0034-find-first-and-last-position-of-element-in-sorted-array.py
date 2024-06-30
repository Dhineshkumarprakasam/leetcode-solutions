class Solution:
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        if target in nums:
            a=nums.index(target)
            b=a+nums.count(target)-1
            return [a,b]
        else:
            return [-1,-1]
        