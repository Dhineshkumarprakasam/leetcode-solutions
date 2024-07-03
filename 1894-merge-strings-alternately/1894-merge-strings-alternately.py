class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        a=''
        length=min(len(word1),len(word2))
        for i in range(0,length):
            a+=word1[i]
            a+=word2[i]
        if len(word1)<len(word2):
            a+=word2[length:]
        else:
            a+=word1[length:]
        return a

