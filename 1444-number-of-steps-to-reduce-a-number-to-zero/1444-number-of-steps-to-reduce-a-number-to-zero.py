class Solution:
    def numberOfSteps(self, num: int) -> int:
        op=0
        while (num>0):
            if num%2==0:
                num=num//2
            else:
                num-=1
            op+=1
        return op