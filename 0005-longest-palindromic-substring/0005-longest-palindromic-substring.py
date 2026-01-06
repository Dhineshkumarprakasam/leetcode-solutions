class Solution:
    def longestPalindrome(self, s: str) -> str:
        llen=0
        lstr=""

        for i in range(len(s)):
            #odd length
            l,r=i,i
            while l>=0 and r<len(s) and s[l]==s[r]:
                size=(r-l+1)
                if llen<size:
                    lstr = s[l:r+1]
                    llen=size
                l-=1
                r+=1

            #even length
            l,r=i,i+1
            while l>=0 and r<len(s) and s[l]==s[r]:
                size=(r-l+1)
                if llen<size:
                    lstr=s[l:r+1]
                    llen=size
                l-=1
                r+=1
        return lstr
            