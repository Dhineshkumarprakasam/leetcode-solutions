class Solution:
    def commonChars(self, words: List[str]) -> List[str]:
        count=Counter(words[0])
        a=[]
        for i in words:
            count&=Counter(i)
        
        for l,w in count.items():
            a+=[l]*w
        return a