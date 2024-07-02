class Solution:
    def sumFourDivisors(self, nums: List[int]) -> int:
        res = 0
        
        for num in nums:
            divisors = set()
            
            for i in range(1, int(num**0.5)+1):
                if not num % i:
                    divisors.add(num//i)
                    divisors.add(i)
                if len(divisors) > 4:
                    break
            
            if len(divisors) == 4:
                res += sum(divisors)
        
        return res