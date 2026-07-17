class Solution {
public:
    bool judgeCircle(string moves) {
        int v = 0;
        int h = 0;

        for(char i : moves){
            if(i=='U')
                v++;
            else if(i=='D')
                v--;
            else if(i=='R')
                h++;
            else
                h--;
        }

        if(h==0 && v==0)
            return true;
        else
            return false;
    }
};