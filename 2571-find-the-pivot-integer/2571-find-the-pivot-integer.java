class Solution {
    public int pivotInteger(int n) {
        int left=0;
        int total = n*(n+1)/2;
        for(int i=1;i<=n;i++){
            left+=i;
            if(left==total-left+i)
                return i;
        }
        return -1;
    }
}