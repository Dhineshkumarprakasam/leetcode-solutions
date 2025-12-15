class Solution:
    def helper(self,processed,unprocessed,map,ans):
        if unprocessed=="":
            ans.append(processed)
            return
        
        char = unprocessed[:1]
        for i in map[char]:
            self.helper(processed+i,unprocessed[1:],map,ans)

    def letterCombinations(self, digits: str) -> List[str]:
        map = {
            '2':'abc','3':'def','4':'ghi','5':'jkl','6':'mno','7':'pqrs','8':'tuv','9':'wxyz'
        }

        ans=[]
        self.helper("",digits,map,ans)
        return ans