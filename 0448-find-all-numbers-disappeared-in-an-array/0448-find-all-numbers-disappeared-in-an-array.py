class Solution:
    def findDisappearedNumbers(self, nums: List[int]) -> List[int]:
        i=0
        while(i<len(nums)):
            if nums[nums[i]-1]!=nums[i]:
                temp = nums[nums[i]-1]
                nums[nums[i]-1]=nums[i]
                nums[i]=temp
            else:
                i+=1
        
        ans=[]
        for idx,e in enumerate(nums):
            if idx+1!=e:
                ans.append(idx+1)
        return ans
