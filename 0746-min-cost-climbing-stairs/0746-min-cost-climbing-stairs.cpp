class Solution {
public:
    int minCostClimbingStairs(vector<int>& cost) {
        int n = cost.size();
        int m1=cost[0];
        int m2=cost[1];

        for(int i=2;i<n;i++){
            int temp=m2;
            m2=min(m1,m2)+cost[i];
            m1=temp;
        }

        return min(m1,m2);
    }
};