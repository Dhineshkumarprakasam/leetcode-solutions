class Solution:
    def shortestToChar(self, s: str, c: str) -> List[int]:
        ind=[i for i in range(len(s)) if s[i]==c]

        ans=[]
        for i in range(len(s)):
            m=None
            for j in ind:
                if m is None:
                    m=abs(i-j)
                m=min(m,abs(i-j))
            ans.append(m)
        
        return ans
                
