class Solution:
    def maxScore(self, s: str) -> int:
        maxi=-1
        for i in range(1,len(s)):
            zc=s[0:i].count('0')
            oc=s[i:].count('1')

            if(zc+oc)>maxi:
                maxi=(zc+oc)
        return maxi