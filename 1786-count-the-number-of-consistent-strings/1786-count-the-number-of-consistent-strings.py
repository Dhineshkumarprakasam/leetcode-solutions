class Solution:
    def countConsistentStrings(self, allowed: str, words: List[str]) -> int:
        count=0
        for i in range(len(words)):
            value=True

            for j in range(len(words[i])):
                if words[i][j] not in allowed:
                    value=False
                    break
            if value==True:
                count+=1
        return count


