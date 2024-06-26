class Solution:
    def sortPeople(self, names: List[str], heights: List[int]) -> List[str]:
        d={}
        arr=[]
        for i in range(0,len(heights)):
            d[heights[i]]=names[i]
        heights.sort()
        heights.reverse()
        
        for j in heights:
            arr.append(d[j])
        return arr
