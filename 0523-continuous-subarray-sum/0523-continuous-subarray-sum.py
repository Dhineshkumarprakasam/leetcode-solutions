class Solution:
    def checkSubarraySum(self, nums: List[int], k: int) -> bool:
        seen = {0: -1}
        prefix_sum = 0
        for i, num in enumerate(nums):
            prefix_sum += num
            residual = prefix_sum % k
            if residual in seen and i - seen[residual] > 1:
                return True
            if residual not in seen:
                seen[residual] = i
    
        return False

