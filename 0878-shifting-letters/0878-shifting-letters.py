class Solution:
    def shiftingLetters(self, s: str, shifts: List[int]) -> str:
        
        n = len(shifts)
        for i in range(n - 2, -1, -1):
            shifts[i] += shifts[i + 1]
        
        s=list(s)
        for i in range(len(s)):
            ans=(ord(s[i])-97+shifts[i]) %26
            s[i]=chr(ans+97)
        return "".join(s)
            

