class Solution:
    def subsetsWithDup(self, nums: List[int]) -> List[List[int]]:
        subset = [[]]
        for num in sorted(nums):
            temp=[]
            for element in subset:
                temp.append(element+[num])
            
            for i in temp:
                if i not in subset:
                    subset.append(i)
        return subset
