class Solution:
    def sortedSquares(self, nums: List[int]) -> List[int]:
        a=list(map(lambda x: x ** 2,nums))
        a.sort()
        return a

