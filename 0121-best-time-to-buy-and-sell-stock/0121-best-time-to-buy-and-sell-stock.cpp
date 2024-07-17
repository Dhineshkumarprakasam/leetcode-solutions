class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int maxProfit=0;
        int minimum=prices[0];

        for(int i=0;i<prices.size();i++)
        {
            int cost=prices[i]-minimum;
            maxProfit=max(maxProfit,cost);
            minimum=min(prices[i],minimum);
        }
        return maxProfit;
    }
};