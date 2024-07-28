class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int maxprofit=0;
        int cost=prices[0];
        for(int i=0;i<prices.size();i++)
        {

            maxprofit=max(maxprofit,prices[i]-cost);
            cost=min(cost,prices[i]);

        }
        return maxprofit;
    }
};