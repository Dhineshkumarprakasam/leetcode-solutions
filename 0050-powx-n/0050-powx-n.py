class Solution:
    def helper(self,x,n):
        if n==0: return 1

        half = self.helper(x,n//2)
        if n%2==0:
            return half*half
        else:
            return half*half*x

    def myPow(self, x: float, n: int) -> float:
        fin = self.helper(x,abs(n))
        if n<0:
            return 1/fin
        return fin