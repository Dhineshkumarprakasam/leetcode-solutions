class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        subset = [[]]
        for num in nums:
            temp=[]
            for element in subset:
                temp.append(element+[num])
            subset.extend(temp)
        return subset
        