class Solution:

    def find_ans(self,board,ans):
        temp=[]
        for i in board:
            row = ""
            for j in i:
                if j==True:
                    row+="Q"
                else:
                    row+="."
            temp.append(row)
        ans.append(temp)

    def isSafe(self,board,r,c):
        tr,tc=r,c
        while(tr>=0 and tc>=0):
            if(board[tr][tc]):
                return False
            tr-=1
            tc-=1
        
        tr,tc=r,c
        while(tc<len(board) and tr>=0):
            if board[tr][tc]:
                return False
            tr-=1
            tc+=1
        
        tr=r
        while(tr>=0):
            if board[tr][c]:
                return False
            tr-=1
        
        return True

    def nq(self,board,n,r,ans):
        if(r==n):
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
            temp = []
            for j in range(n):
                temp.append(False)
            board.append(temp)
        
        self.nq(board,n,0,ans)
        return ans