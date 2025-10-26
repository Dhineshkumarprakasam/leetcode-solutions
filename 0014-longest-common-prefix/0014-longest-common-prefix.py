class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        current = strs[0]
        
        for i in strs:
            common=""
            for j in range(min(len(i),len(current))):
                if current[j]==i[j]:
                    common+=i[j]
                else:
                    break
            current=common
        return current