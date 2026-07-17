class Solution {
public:
    vector<string> findRelativeRanks(vector<int>& score) {
        int n = score.size();
        int greaterCount[n];
        vector<string> ans(n,"");

        for(int i=0;i<n;i++){
            greaterCount[i]=0;
            for(int j=0;j<n;j++)
                if(score[j]>score[i]){
                    greaterCount[i]++;
                }
        }

        for(int i=0;i<n;i++){
            int rank = greaterCount[i]+1;
            if(rank==1)
                ans[i]="Gold Medal";
            else if(rank==2)
                ans[i]="Silver Medal";
            else if(rank==3)
                ans[i]="Bronze Medal";
            else
                ans[i]=to_string(rank);
        }

        return ans;
    }
};