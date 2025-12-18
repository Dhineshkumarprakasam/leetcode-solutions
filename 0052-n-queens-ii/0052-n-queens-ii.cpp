class Solution {
public:
    bool isSafe(vector<vector<bool>> &board, int r, int c){
        int tr=r;
        int tc=c;
        //left diag
        while(tr>=0 && tc>=0){
            if(board[tr][tc])
                return false;
            tr--;
            tc--;
        }

        tr=r;
        tc=c;
        //right diag
        while(tr>=0 && tc<board.size()){
            if(board[tr][tc])
                return false;
            tr--;
            tc++;
        }

        tr=r;
        tc=c;
        //vertical
        while(tr>=0){
            if(board[tr][tc])
                return false;
            tr--;
        }
        
        return true;
    }

    int nq(vector<vector<bool>> &board, int r){
        if(r==board.size()){
            return 1;
        }

        int count=0;
        for(int c=0;c<board.size();c++){
            if(isSafe(board,r,c)){
                board[r][c]=true;
                count+=nq(board,r+1);
                board[r][c]=false;
            }
        }

        return count;
    }

    int totalNQueens(int n) {
        vector<vector<bool>> board(n,vector<bool>(n,false));
        return nq(board,0);
    }
};