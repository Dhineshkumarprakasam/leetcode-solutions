class Solution:
    def threeConsecutiveOdds(self, arr: List[int]) -> bool:
        cons=0
        for i in range(len(arr)):
            if arr[i]%2!=0:
                cons+=1
                if cons==3:
                    return True
            else:
                cons=0
        return False
                
                
