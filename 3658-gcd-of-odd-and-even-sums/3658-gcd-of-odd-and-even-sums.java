class Solution {
    public int gcd(int a, int b){
        if(a==0) return b;
        return gcd(b%a,a);
    }
    public int gcdOfOddEvenSums(int n) {
        return gcd(n*(n+1),n*n);
    }
}