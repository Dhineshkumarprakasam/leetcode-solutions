class Solution:
    def reverseDegree(self, s: str) -> int:
        ans=0
        for i in range(len(s)):
            value = 123-ord(s[i])
            ans+=(value*(i+1))
        return ans
