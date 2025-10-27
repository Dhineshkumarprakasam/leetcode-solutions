class Solution:
    def numberOfBeams(self, bank: List[str]) -> int:
        layers = []
        for i in bank:
            c = i.count('1')
            if c>0:
                layers.append(c)
        
        if not layers:
            return 0
        
        ans=0
        for i in range(1,len(layers)):
            ans+=layers[i-1]*layers[i]
        
        return ans
        