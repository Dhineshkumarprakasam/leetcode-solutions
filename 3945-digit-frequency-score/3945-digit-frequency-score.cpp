class Solution {
public:
    int digitFrequencyScore(int n) {
        map<int,int> m;

        while(n>0){
            int val = n%10;
            if(m.find(val)==m.end())
                m[val]=1;
            else
                m[val]++;
            n=n/10;
        }

        int ans=0;
        for(const auto &i : m){
            ans+=(i.first * i.second);
        }

        return ans;
    }
};