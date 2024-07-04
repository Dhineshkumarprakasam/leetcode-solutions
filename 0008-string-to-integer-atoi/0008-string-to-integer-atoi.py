class Solution:
    def myAtoi(self, s: str) -> int:
        val=""
        sign=1
        s=s.lstrip()
        for i in range(0,len(s)):
            if (s[i]=='-' and i==0):
                sign=-1
                continue
            elif s[i]=='+' and i==0:
                continue
            if(s[i].isdigit()==True):
                val+=s[i]
            else:
                break
        if len(val)>=1:
            ans=int(val)*sign
            if ans<-2**31:
                return -2**31
            elif ans>2**31-1:
                return 2**31-1
            else:
                return ans
        else:
            return 0
        