class Solution:
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:
        ransomNote=sorted(ransomNote)
        magazine=sorted(magazine)
        
        for i in ransomNote:
            if i in magazine:
                magazine[magazine.index(i)]=0
            else:
                return False
        return True
            
