class Solution {
public:
    int rec(int n, int dp[]){
        if(n==1) return 1;
        if(n==2) return 2;

        if(dp[n]!=-1) return dp[n];

        int result = rec(n-1,dp)+rec(n-2,dp);
        dp[n]=result;
        return result;
    }
    int climbStairs(int n) {
        int dp[n+1];
        for(int i=0;i<=n;i++)
            dp[i]=-1;
            
        return rec(n,dp);
    }
};