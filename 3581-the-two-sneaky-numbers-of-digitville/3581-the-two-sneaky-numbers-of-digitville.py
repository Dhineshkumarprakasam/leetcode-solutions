class Solution:
    def getSneakyNumbers(self, nums: List[int]) -> List[int]:
        d=Counter(nums)
        return [i for i,j in d.items() if j==2]