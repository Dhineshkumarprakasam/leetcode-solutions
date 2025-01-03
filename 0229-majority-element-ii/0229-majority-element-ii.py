class Solution:
    def majorityElement(self, nums: List[int]) -> List[int]:
        ans=set()
        div=len(nums)/3
        for i in nums:
            if(nums.count(i)>div):
                ans.add(i)
        return list(ans)