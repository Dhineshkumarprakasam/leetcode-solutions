class Solution:
    def appendCharacters(self, s: str, t: str) -> int:
        t_index = 0
        t_len = len(t)
        
        for char in s:
            if t_index < t_len and char == t[t_index]:
                t_index += 1
        
        return t_len - t_index
