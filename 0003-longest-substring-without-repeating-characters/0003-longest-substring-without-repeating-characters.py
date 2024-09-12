class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        start=0
        end=0
        se=set()
        maxi=0
        for i in range(len(s)):
            if s[i] not in se:
                se.add(s[i])
                end+=1
            else:
                while s[i] in se:
                    se.remove(s[start])
                    start+=1
                se.add(s[i])
                end+=1

            size=end-start
            if size>maxi:
                maxi=size
        return maxi
            
            

        