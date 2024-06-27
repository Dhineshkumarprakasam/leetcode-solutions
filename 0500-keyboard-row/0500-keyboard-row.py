class Solution:
    def findWords(self, words: List[str]) -> List[str]:
        first="qwertyuiopQWERTYUIOP"
        second="asdfghjklASDFGHJKL"
        third="zxcvbnmZXCVBNM"
        ans=[]
        for i in words:
            if i[0] in first:
                if all(j in first for j in i):
                    ans.append(i)

            elif i[0] in second:
                if all(j in second for j in i):
                    ans.append(i)
            
            elif i[0] in third:
                if all(j in third for j in i):
                    ans.append(i)
        return ans