class Solution(object):
    def trap(self, height):
        size=len(height)
        
        left=size*[0]
        right=size*[0]
        
        left[0]=height[0]
        
        max=height[0]
        
        for i in range(0,size):
            if max<height[i]:
                max=height[i]
                left[i]=max
            else:
                left[i]=max
        
        max=height[-1]
        
        for i in range(size-1,-1,-1):
            if max<height[i]:
                max=height[i]
                right[i]=max
            else:
                right[i]=max
        water=0
        
        for i in range(0,size):
            water+=min(left[i],right[i])-height[i]
        
        
        return water
        