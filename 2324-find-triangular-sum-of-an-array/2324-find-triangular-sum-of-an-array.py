class Solution:
    def triangularSum(self, nums: List[int]) -> int:
        while(len(nums)>1):
            nums2=[]
            for i in range(0,len(nums)-1):
                
                nums2.append((nums[i]+nums[i+1])%10)
            nums=nums2
            
        return nums[0]