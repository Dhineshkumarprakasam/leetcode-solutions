class Solution:
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        a=[]
        if target in nums:
            for i in range(0,len(nums)):
                if nums[i]==target:
                    a.append(i)
            return [min(a),max(a)]
        else:
            return [-1,-1]
            