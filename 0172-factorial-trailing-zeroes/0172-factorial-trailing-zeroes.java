class Solution {
    public int trailingZeroes(int n) {
        int zeros=0;
        int div=5;

        while(n>=div)
        {
           zeros+=(n/div);
           div*=5;
        }

        return zeros;
    }
}