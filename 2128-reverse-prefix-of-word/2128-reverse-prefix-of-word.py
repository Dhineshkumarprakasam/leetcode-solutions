class Solution:
    def reversePrefix(self, word: str, ch: str) -> str:
        index=word.find(ch)
        part=word[0:index+1]
        part=part[::-1]
        word=word.replace(word[0:index+1],part)
        return word