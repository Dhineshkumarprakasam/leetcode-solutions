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

    void find_ans(vector<vector<string>> &ans, vector<vector<bool>> &board){
        vector<string> tv;
        for(int i=0;i<board.size();i++){
            string temp="";
            for(int j=0;j<board.size();j++){
                if(board[i][j])
                    temp+="Q";
                else
                    temp+=".";
            }
            tv.push_back(temp);
        }

        ans.push_back(tv);
    }
    void nq(vector<vector<bool>> &board, int r, vector<vector<string>> &ans){
        if(r==board.size()){
            find_ans(ans,board);
            return;
        }

        for(int c=0;c<board.size();c++){
            if(isSafe(board,r,c)){
                board[r][c]=true;
                nq(board,r+1,ans);
                board[r][c]=false;
            }
        }
    }
    vector<vector<string>> solveNQueens(int n) {
        vector<vector<bool>> board(n,vector<bool>(n,false));
        vector<vector<string>> ans;
        nq(board,0,ans);
        return ans;
    }
};