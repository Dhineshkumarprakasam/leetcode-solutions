class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        count=0
        for i in range(0,len(nums)):
            if(nums[i]==0):
                nums.remove(nums[i])
                nums+=[0]
        

        