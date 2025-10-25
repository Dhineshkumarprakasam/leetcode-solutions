class Solution {
    public int totalMoney(int n) {
        
        int ans=0;
        if(n<=7)
            return n*(n+1)/2;
        
        int count_of_seven = n/7;

        int rem = n % 7;
        for(int i=0;i<count_of_seven;i++)
            ans += 7 * (i + 4);

        for (int i = 1; i <= rem; i++)
            ans += count_of_seven + i;

        return ans;
    }
}