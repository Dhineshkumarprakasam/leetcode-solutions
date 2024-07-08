class Solution:
    def findDuplicates(self, nums: List[int]) -> List[int]:
        c=Counter(nums)
        count=[]
        for i in c:
            if c[i]>1:
                count.append(i)
        return count