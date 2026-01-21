class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        n=len(nums)
        maxi=float("-inf")
        
        prefix=1
        for i in range(n):
            prefix*=nums[i]
            maxi=max(maxi,prefix)
            if prefix==0:
                prefix=1
        
        suffix=1
        for i in range(n-1,-1,-1):
            suffix*=nums[i]
            maxi=max(maxi,suffix)
            if suffix==0:
                suffix=1
        
        return maxi