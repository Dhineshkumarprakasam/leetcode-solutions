class Solution:
    def reverseOnlyLetters(self, s: str) -> str:
        a=[]
        index=[]
        for i in range(len(s)):
            if s[i].isalpha():
                a.append(s[i])
            else:
                index.append([s[i],i])

        a=a[::-1]

        for e,i in index:
            a.insert(i,e)
        return "".join(a)
            
        