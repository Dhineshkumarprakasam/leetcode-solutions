class Solution:
    def helper(self,r,c,grid,vis,rem):
        if(grid[r][c]==-1 or vis[r][c]): 
            return 0

        if(grid[r][c]==2):
            if rem==1:
                return 1
            return 0

        path=0
        vis[r][c]=True
        #top
        if(r>0):
            path+=self.helper(r-1,c,grid,vis,rem-1)
        #down
        if(r<len(grid)-1):
            path+=self.helper(r+1,c,grid,vis,rem-1)
        #left
        if(c>0):
            path+=self.helper(r,c-1,grid,vis,rem-1)
        #right
        if(c<len(grid[0])-1):
            path+=self.helper(r,c+1,grid,vis,rem-1)
        vis[r][c]=False
        return path

    def uniquePathsIII(self, grid: List[List[int]]) -> int:
        vis=[[False for _ in range(len(grid[0]))] for _ in range(len(grid))] 
        r,c=0,0
        rem=0
        for i in range(0,len(grid)):
            for j in range(0,len(grid[0])):
                if grid[i][j]==1:
                    r,c=i,j
                if grid[i][j]!=-1:
                    rem+=1
                
        return self.helper(r,c,grid,vis,rem)