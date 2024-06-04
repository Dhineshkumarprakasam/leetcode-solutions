class Solution:
    def longestPalindrome(self, s: str) -> int:

        odd=[]
        even=[]
        done=[]
        for i in s:
            if(i not in done):
                co=s.count(i)
                if(co%2==0):
                    even.append(co)
                else:
                    odd.append(co)
                done.append(i)

        if(len(odd)>=1):
            return sum(even)+sum(odd)-len(odd)+1
        else:
            return sum(even)+sum(odd)-len(odd)