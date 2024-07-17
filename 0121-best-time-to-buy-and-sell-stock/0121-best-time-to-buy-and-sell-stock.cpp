class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int maxp=0;
        int mini=prices[0];
        for(int i=0;i<prices.size();i++)
        {
            int cost=prices[i]-mini;
            maxp=max(maxp,cost);
            mini=min(mini,prices[i]);
                
        }

        return maxp;
    }
};