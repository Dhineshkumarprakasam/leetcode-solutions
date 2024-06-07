class Solution:
    def replaceWords(self, dictionary: List[str], sentence: str) -> str:
        sentence=sentence.split()
        for i in range(len(dictionary)):
            for j in range(len(sentence)):
                if(sentence[j].startswith(dictionary[i])):
                    sentence[j]=dictionary[i]
        return " ".join(sentence)