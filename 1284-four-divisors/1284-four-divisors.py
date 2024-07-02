class Solution:
    def sumFourDivisors(self, nums: List[int]) -> int:
        def sum_if_four_divisors(num: int) -> int:
            divisor = 2
            count, sum_of_divisors = 2, num + 1 
            while divisor <= num // divisor:
                if num % divisor == 0:
                    count += 1
                    sum_of_divisors += divisor
                    if divisor * divisor != num:
                        count += 1
                        sum_of_divisors += num // divisor
                divisor += 1
            return sum_of_divisors if count == 4 else 0
        return sum(sum_if_four_divisors(num) for num in nums)