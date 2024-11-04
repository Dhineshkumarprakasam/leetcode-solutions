class Solution {
public:
    int check(int n)
    {
        int number=n;

        while(number>0)
        {
            int last=number%10;
            number=number/10;

            if(last==0 || n%last!=0)
                return 0;
        }
        return 1;
    }
    vector<int> selfDividingNumbers(int left, int right) {

        vector<int> ans;

        for(int i=left;i<=right;i++)
        {
            if(check(i)==1)
                ans.push_back(i);
        }

        return ans;
    }
};