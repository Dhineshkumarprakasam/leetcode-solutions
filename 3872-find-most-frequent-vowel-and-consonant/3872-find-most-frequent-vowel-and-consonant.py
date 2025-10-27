class Solution:
    def maxFreqSum(self, s: str) -> int:
        vow = {}
        con = {}

        if len(s)=="":
            return 0
        for i in s:
            if i in ['a','e','i','o','u']:
                if i in vow:
                    vow[i]=vow[i]+1
                else:
                    vow[i]=1
            else:
                if i in con:
                    con[i]=con[i]+1
                else:
                    con[i]=1
        
        f1,f2=0,0

        if vow:
            f1 = sorted(vow.values(),reverse=True)[0]
        if con:
            f2 = sorted(con.values(),reverse=True)[0]

        return f1+f2
        
