class Solution:
    def convertDateToBinary(self, date: str) -> str:
        a=date.split('-')
        for i in range(len(a)):
            a[i]=bin(int(a[i]))[2:]
        return '-'.join(a)