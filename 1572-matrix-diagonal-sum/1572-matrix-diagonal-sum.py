class Solution:
    def diagonalSum(self, mat: List[List[int]]) -> int:
        
        total=0
        
        for i in range(0,len(mat)):
            for j in range(0,len(mat)):
                if(i==j or i==len(mat)-j-1):
                    total+=mat[i][j]
                    
        return total            