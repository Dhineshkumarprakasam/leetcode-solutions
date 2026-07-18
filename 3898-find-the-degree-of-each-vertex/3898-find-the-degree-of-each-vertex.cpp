class Solution {
public:
    vector<int> findDegrees(vector<vector<int>>& matrix) {
        int r = matrix.size();
        int c = matrix[0].size();

        vector<int> ans (r,0);

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(matrix[i][j]==1)
                    ans[j]++;
            }
        }
        return ans;
    }
};