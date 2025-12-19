class Solution {
public:
    int numRookCaptures(vector<vector<char>>& board) {
        int count=0;
        int pos_r,r,pos_c,c;
        //find post of rook
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++)
                if(board[i][j]=='R'){
                    pos_r=i;
                    pos_c=j;
                }
        }

        //check top;
        r=pos_r-1;
        c=pos_c;
        while(r>0 && board[r][c]=='.'){
            r--;
        }
        if(r>=0 && board[r][c]=='p')
            count++;


        //check bottom;
        r=pos_r+1;
        c=pos_c;
        while(r<8 && board[r][c]=='.'){
            r++;
        }

        if(r<8 && board[r][c]=='p')
            count++;


        //check right;
        r=pos_r;
        c=pos_c+1;
        while(c<8 && board[r][c]=='.'){
            c++;
        }
        if(c<8 && board[r][c]=='p')
            count++;
        

        //check left;
        r=pos_r;
        c=pos_c-1;
        while(c>0 && board[r][c]=='.'){
            c--;
        }
        if(c>=0 && board[r][c]=='p')
            count++;

        return count;
    }
};