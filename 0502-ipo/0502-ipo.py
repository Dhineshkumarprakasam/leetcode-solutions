class Solution:
    def findMaximizedCapital(self, k: int, startingCapital: int, profits: List[int], capital: List[int]) -> int:
        min_heap_by_capital = [(c, p) for c, p in zip(capital, profits)]
        heapify(min_heap_by_capital)
        max_heap_by_profit = []
        while k:
            while min_heap_by_capital and min_heap_by_capital[0][0] <= startingCapital:
                heappush(max_heap_by_profit, -heappop(min_heap_by_capital)[1])
            if not max_heap_by_profit:
                break
            startingCapital -= heappop(max_heap_by_profit)
            k -= 1
        return startingCapital