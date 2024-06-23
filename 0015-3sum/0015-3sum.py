class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        result=[]

        if len(nums)<3:
            return []

        for i in range(len(nums)-2):
            if nums[i]==nums[i-1] and i>0:
                continue
            a=nums[i]
            l=i+1
            r=len(nums)-1
            
            while(l<r):
                s=a+nums[l]+nums[r]
                if s==0:
                    result.append([nums[i],nums[l],nums[r]])
                    l+=1
                    r-=1
                    while nums[l]==nums[l-1] and l<r:
                        l+=1
                    while nums[r]==nums[r+1] and l<r:
                        r-=1
                elif s<0:
                    l+=1
                    while nums[l]==nums[l-1] and l<r:
                        l+=1
                elif s>0:
                    r-=1
                    while nums[r]==nums[r+1] and l<r:
                        r-=1
        return result




