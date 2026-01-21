class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        n=len(nums)
        maxi=float("-inf")
        
        prefix,suffix=1,1
        for i in range(n):
            prefix*=nums[i]
            suffix*=nums[n-i-1]

            maxi=max(maxi,prefix)
            maxi=max(maxi,suffix)

            if prefix==0: prefix=1
            if suffix==0: suffix=1
        
        return maxi