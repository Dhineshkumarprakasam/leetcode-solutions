class Solution:
    def find(self,num,dic):
        ans=[]
        while(num>0):
            val = num%16
            if(val>=10):
                ans.insert(0,dic.get(val))
            else:
                ans.insert(0,str(val))
            num=num//16
        return ''.join(ans)

    def toHex(self, num: int) -> str:
        dic = {10:'a',11:'b',12:'c',13:'d',14:'e',15:'f'}
        if num==0:
            return "0"
        
        if(num<0):
            num = num & 0xFFFFFFFF
        return self.find(num,dic)
        