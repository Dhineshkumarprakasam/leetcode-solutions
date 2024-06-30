import numpy
class Solution:
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        nums=numpy.array(nums)

        if target in nums:
            indices = numpy.where(nums == target)[0]
            return [min(indices),max(indices)]
        else:
            return [-1,-1]
        