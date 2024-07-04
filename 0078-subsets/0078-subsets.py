import itertools
class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        subsets = []
        for r in range(len(nums) + 1):
            subsets.extend(list(itertools.combinations(nums, r)))
        return subsets