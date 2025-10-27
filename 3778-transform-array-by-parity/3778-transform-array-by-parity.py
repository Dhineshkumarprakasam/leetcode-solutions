class Solution:
    def transformArray(self, nums: List[int]) -> List[int]:
        odd=0
        even=0
        for i in nums:
            if i%2==0:
                even+=1
            else:
                odd+=1
        
        return [0]*even + [1]*odd