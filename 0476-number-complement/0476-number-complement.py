class Solution:
    def findComplement(self, num: int) -> int:
        ans=''
        b=bin(num)
        
        for i in range(2,len(b)):
            if b[i]=='1':
                ans+='0'
            elif b[i]=='0':
                ans+='1'
            else:
                continue
        ans='0b'+ans
        return int(ans,2)
