class Solution:
    def sortPeople(self, names: List[str], heights: List[int]) -> List[str]:
        arr=[]
        for i in range(0,len(heights)):
            index=heights.index(max(heights))
            heights[index]=0
            arr.append(names[index])
        return arr