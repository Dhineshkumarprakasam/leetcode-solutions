class Solution:
    def longestCommonSubsequence(self, text1: str, text2: str) -> int:
        m,n = len(text1),len(text2)
        lcs=[]
        for i in range(m+1):
            row=[]
            for j in range(n+1):
                row.append(0)
            lcs.append(row)

        for i in range(1,m+1):
            for j in range(1,n+1):
                if text1[i-1]==text2[j-1]:
                    lcs[i][j]=1+lcs[i-1][j-1]
                else:
                    lcs[i][j]=max(lcs[i-1][j],lcs[i][j-1])
        return lcs[m][n]
