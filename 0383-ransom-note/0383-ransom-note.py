class Solution:
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:
        for l in ransomNote:
            if l not in magazine:
                return False
            magazine = magazine.replace(l, " ", 1)
        return True