class Solution:
    def minOperations(self, nums: List[int], k: int) -> int:
        nums.sort()
        op=0
        for i in nums:
            if i>=k:
                break
            else:
                op+=1
        return op