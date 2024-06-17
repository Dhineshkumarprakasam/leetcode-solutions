class Solution:
    def judgeSquareSum(self, c: int) -> bool:
        for a in range(int(math.isqrt(c)) + 1):
            b_squared = c - a * a
            b = int(math.isqrt(b_squared))
            if b * b == b_squared:
                return True
        return False