class Solution:
    def isSafe(self,board,r,c):
        tr,tc=r,c
        while tc>=0 and tr>=0:
            if board[tr][tc]:
                return False
            tc-=1
            tr-=1
        
        tr,tc=r,c
        while tc<len(board)  and tr>=0:
            if board[tr][tc]:
                return False
            tc+=1
            tr-=1

        tr=r
        while tr>=0:
            if board[tr][c]:
                return False
            tr-=1
        
        return True

    def find_ans(self,board,ans):
        temp=[]
        for i in range(len(board)):
            row = ""
            for j in range(len(board)):
                if board[i][j]:
                    row+="Q"
                else:
                    row+="."
            temp.append(row)
        ans.append(temp)
    
    def nq(self,board,n,r,ans):
        if r==n:
            self.find_ans(board,ans)
            return

        for c in range(n):
            if self.isSafe(board,r,c):
                board[r][c]=True
                self.nq(board,n,r+1,ans)
                board[r][c]=False
            
    def solveNQueens(self, n: int) -> List[List[str]]:
        board=[]
        ans=[]
        for i in range(n):
            temp=[]
            for j in range(n):
                temp.append(False)
            board.append(temp)
        self.nq(board,n,0,ans)
        return ans