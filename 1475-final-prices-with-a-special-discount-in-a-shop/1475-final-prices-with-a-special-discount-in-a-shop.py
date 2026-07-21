class Solution:
    def finalPrices(self, prices: List[int]) -> List[int]:
        for i in range(0,len(prices)):
            found=0
            for j in range(i+1,len(prices)):
                if found==1:
                    break
                if(prices[i]>=prices[j]):
                    prices[i]=(prices[i]-prices[j])
                    found=1
              


        return prices
