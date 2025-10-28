class Solution:
    def reverseDegree(self, s: str) -> int:
        ans=0
        for i in range(len(s)):
            value = abs(ord(s[i])-97-26)
            ans+=(value*(i+1))
        return ans
