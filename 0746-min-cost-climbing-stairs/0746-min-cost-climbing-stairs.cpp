class Solution {
public:
    int minCostClimbingStairs(vector<int>& cost) {
        int m1=cost[0];
        int m2=cost[1];

        for(int i=2;i<cost.size();i++){
            int current = min(m1,m2)+cost[i];
            m1=m2;
            m2=current;
        }

        return min(m1,m2);
    }
};