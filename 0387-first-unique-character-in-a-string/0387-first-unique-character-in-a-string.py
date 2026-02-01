class Solution:
    def firstUniqChar(self, s: str) -> int:
        d = dict()
        for i in s:
            d[i]=d.get(i,0)+1
        
        for i in range(len(s)):
            if d.get(s[i],0)==1:
                return i
                
        return -1