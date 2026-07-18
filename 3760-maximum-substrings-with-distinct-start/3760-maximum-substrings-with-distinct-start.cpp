class Solution {
public:
    int maxDistinct(string s) {
        set<char> se;
        for(char i : s)
            se.insert(i);
        
        return se.size();
    }
};