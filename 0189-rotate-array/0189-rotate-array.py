class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        numsSize=len(nums)
        for i in range(0,k):
            val=nums[-1]
            nums.pop(-1)
            nums.insert(0,val)
            
        
        