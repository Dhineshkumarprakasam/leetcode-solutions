class Solution {
public:
    bool isPerfectSquare(int num) {
        if(pow((int)pow(num,0.5),2)==num)
            return true;
        else
            return false;
    }
};