class Solution:
    def largestOddNumber(self, num: str) -> str:
        for i in range(len(num)):
            if(int(num[len(num)-i-1])%2!=0):
                return num[0:len(num)-i]
        return ""
