class Solution:
    def helper(self,p,unp,ans):
        if unp=="":
            ans.append(p)
            return
        
        for i in range(len(p)+1):
            first = p[:i]
            last = p[i:]
            ch = unp[0]
            self.helper(first+ch+last,unp[1:],ans)

    def getPermutation(self, n: int, k: int) -> str:
        inp="".join([str(i) for i in range(1,n+1)])
        ans=[]
        self.helper("",inp,ans)
        ans.sort()
        return ans[k-1]
