class Solution:
    def chalkReplacer(self, chalk: List[int], k: int) -> int:
        s=sum(chalk)
        ans=k%s
        if(ans==0):
            return 0
        else:
            for i in range(0,len(chalk)):
                if(ans>=chalk[i]):
                    ans-=chalk[i]
                else:
                    return i
