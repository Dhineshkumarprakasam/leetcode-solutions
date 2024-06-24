class Solution:
    def isPowerOfThree(self, n: int) -> bool:
        if n==1:
            return True
        for i in range(1,n):
            if n**(1/i)==3:
                return True
            if (n**(1/i))<3:
                break
                
        return False