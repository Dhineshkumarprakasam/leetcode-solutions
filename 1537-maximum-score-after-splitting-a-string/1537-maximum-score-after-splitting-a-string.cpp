class Solution {
public:
    int maxScore(string s) {
        int maxi=-1;

        for(int i=1;i<s.length();i++)
        {
            int zc = count(s.begin(),s.begin()+i,'0');
            int oc = count(s.begin()+i,s.end(),'1');

            if(zc+oc > maxi)
                maxi=(zc+oc);
        }

        return maxi;
    }
};