class Solution:
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        arr=[]
        if(target in nums):
            a=nums.index(target)
            nums.reverse()
            b=nums.index(target)
            arr.extend([a,len(nums)-1-b])
        else:
            arr.extend([-1,-1])
        return arr