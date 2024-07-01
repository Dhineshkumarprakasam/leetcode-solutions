class Solution:
    def sortedSquares(self, nums: List[int]) -> List[int]:
        li = [x**2 for x in nums]
        li.sort()
        return li
