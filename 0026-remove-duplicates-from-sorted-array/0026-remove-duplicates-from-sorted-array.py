class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        ele=nums[0]
        index=0

        for i in range(len(nums)):
            if nums[i]!=ele:
                ele=nums[i]
                nums[index+1]=nums[i]
                index+=1
        return index+1

