class Solution {
public:
    bool verify(string s,int f, int l){
        map<char,int> m;
        for(int i=f;i<=l;i++){
            if(m.find(s[i])==m.end())
                m[s[i]]=1;
            else
                m[s[i]]++;
        }

        for(auto i : m){
            if(i.second>1)
                return false;
        }
        return true;
    }
    int countGoodSubstrings(string s) {
        int f=0;
        int l=2;
        int ans=0;

        if(s.size()<3)
            return 0;
        
        while(l<s.size()){
            if(verify(s,f,l))
                ans++;
            f++;
            l++;
        }
        return ans;
    }
};