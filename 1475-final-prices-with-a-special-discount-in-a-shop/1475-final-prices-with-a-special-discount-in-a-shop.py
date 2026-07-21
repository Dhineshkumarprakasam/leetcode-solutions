class Solution:
    def finalPrices(self, prices: List[int]) -> List[int]:
        ans=[]
        for i in range(0,len(prices)):
            found=0
            for j in range(i+1,len(prices)):
                if found==1:
                    break
                if(prices[i]>=prices[j]):
                    ans.append(prices[i]-prices[j])
                    found=1
            if(found==0):
                ans.append(prices[i])    


        return ans
