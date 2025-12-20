class Solution:
    def queensAttacktheKing(self, queens: List[List[int]], king: List[int]) -> List[List[int]]:
        output=[]
        #check top
        r,c=king[0]-1,king[1]
        while(r>=0):
            if([r,c] in queens):
                output.append([r,c])
                break
            r-=1
        
        #check bottom
        r,c=king[0]+1,king[1]
        while(r<8):
            if([r,c] in queens):
                output.append([r,c])
                break
            r+=1
        
        #check left
        r,c=king[0],king[1]-1
        while(c>=0):
            if([r,c] in queens):
                output.append([r,c])
                break
            c-=1
        
        #check right
        r,c=king[0],king[1]+1
        while(c<8):
            if([r,c] in queens):
                output.append([r,c])
                break
            c+=1
        
        #check top left diagonal
        r,c=king[0]-1,king[1]-1
        while(r>=0 and c>=0):
            if([r,c] in queens):
                output.append([r,c])
                break
            c-=1
            r-=1
        
        #check top right diagonal
        r,c=king[0]+1,king[1]+1
        while(r<8 and c<8):
            if([r,c] in queens):
                output.append([r,c])
                break
            c+=1
            r+=1
        
        #check bottom left diagonal
        r,c=king[0]+1,king[1]-1
        while(r<8 and c>=0):
            if([r,c] in queens):
                output.append([r,c])
                break
            c-=1
            r+=1
        
        #check bottom right diagonal
        r,c=king[0]-1,king[1]+1
        while(r>=0 and c<8):
            if([r,c] in queens):
                output.append([r,c])
                break
            c+=1
            r-=1
        
        return output
        






