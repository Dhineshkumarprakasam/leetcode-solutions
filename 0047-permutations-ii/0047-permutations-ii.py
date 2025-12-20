class Solution:
    def helper(self,p,un,ans):
        if not un:
            if p not in ans:
                ans.append(p)
            return
        
        for i in range(len(p)+1):
            first=p[:i]
            last=p[i:]
            self.helper(first+[un[0]]+last,un[1:],ans)
        
    def permuteUnique(self, nums: List[int]) -> List[List[int]]:
        ans=[]
        self.helper([],nums,ans)
        return ans