class Solution:
    def findDisappearedNumbers(self, nums: List[int]) -> List[int]:
        return list({i for i in range(1,len(nums)+1)}-set(nums))
        
