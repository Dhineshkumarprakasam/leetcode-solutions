class Solution:
    def isPowerOfThree(self, n: int) -> bool:
        while n!=1 and n>2:
            n=n/3
        if n==1:
            return True
        else:
            return False