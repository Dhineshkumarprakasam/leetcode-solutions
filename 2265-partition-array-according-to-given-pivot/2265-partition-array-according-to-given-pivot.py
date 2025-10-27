class Solution:
    def pivotArray(self, nums: List[int], pivot: int) -> List[int]:
        first,second,third=[],0,[]

        for i in nums:
            if i==pivot:
                second+=1
            if i<pivot:
                first.append(i)
            if i>pivot:
                third.append(i)
        return first+[pivot]*second+third