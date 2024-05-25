class Solution:
    def countDistinctIntegers(self, nums: List[int]) -> int:
        n=len(nums)
        for i in range(0,n):
            cp=nums[i]
            rev=0
            while(cp>0):
                rev=rev*10+(cp%10)
                cp=cp//10
            nums.append(rev)
        return len(set(nums))