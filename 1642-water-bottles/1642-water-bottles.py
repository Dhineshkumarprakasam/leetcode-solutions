class Solution:
    def numWaterBottles(self, numBottles: int, numExchange: int) -> int:
        ans=numBottles
        while(numBottles>=numExchange):
            ans+=numBottles//numExchange
            pending=numBottles%numExchange
            numBottles=numBottles//numExchange
            numBottles+=pending
        return ans
