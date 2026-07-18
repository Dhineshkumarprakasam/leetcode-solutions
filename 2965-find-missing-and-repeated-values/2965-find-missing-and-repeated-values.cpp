class Solution {
public:
    vector<int> findMissingAndRepeatedValues(vector<vector<int>>& grid) {
        int r = grid.size();
        int c = grid[0].size();
        int n = r*c;
        set<int> s;
        vector<int> ans;

        int total = (n*(n+1))/2;
        int currTotal = 0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                int e = grid[i][j];
                if(s.find(e)==s.end()){
                    s.insert(e);
                    currTotal+=e;
                }
                else{
                    ans.push_back(e);
                }
            }
        }

        ans.push_back(total-currTotal);
        return ans;
    }
};