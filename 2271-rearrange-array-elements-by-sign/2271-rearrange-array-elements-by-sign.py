class Solution:
    def rearrangeArray(self, nums: List[int]) -> List[int]:
        ans=[0]*len(nums)
        pi=0
        ni=1

        for i in nums:
            if i<0:
                ans[ni]=i
                ni+=2
            else:
                ans[pi]=i
                pi+=2
        return ans