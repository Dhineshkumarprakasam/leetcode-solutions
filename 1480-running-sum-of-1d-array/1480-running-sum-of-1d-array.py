class Solution:
    def runningSum(self, nums: List[int]) -> List[int]:
        a=[]
        for i in range(0,len(nums)):
            c=0
            for j in range(i+1):
                c+=nums[j]
            a.append(c)
        return a