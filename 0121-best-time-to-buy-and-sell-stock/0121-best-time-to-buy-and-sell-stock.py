class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        maxi=float("-inf")
        cost=prices[0]
        for i in range(len(prices)):
            maxi=max(maxi,prices[i]-cost)
            cost=min(cost,prices[i])
        return maxi
