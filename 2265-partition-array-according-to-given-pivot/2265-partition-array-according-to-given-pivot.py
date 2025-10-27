class Solution:
    def pivotArray(self, nums: List[int], pivot: int) -> List[int]:
        first = []
        second =[]
        third=[]

        for i in nums:
            if i==pivot:
                second.append(i)
            if i<pivot:
                first.append(i)
            if i>pivot:
                third.append(i)
        return first+second+third