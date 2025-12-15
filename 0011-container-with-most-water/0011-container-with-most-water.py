class Solution:
    def maxArea(self, height: List[int]) -> int:
        l,r=0,len(height)-1

        maximum=0
        while(l<r):
            unit = min(height[l],height[r])*(r-l)
            maximum=max(maximum,unit)

            if(height[l]<height[r]):
                l+=1
            else:
                r-=1
        return maximum