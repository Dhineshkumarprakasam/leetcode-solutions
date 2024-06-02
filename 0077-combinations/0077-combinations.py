class Solution:
    def combine(self, n: int, k: int) -> List[List[int]]:
        element=list(range(1,n+1))
        combinations = itertools.combinations(element, k)
        l=[]
        for combination in combinations:
            l.append(list(combination))
        return l