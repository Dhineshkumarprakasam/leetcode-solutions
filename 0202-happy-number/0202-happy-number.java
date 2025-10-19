class Solution {
    public static int sum(int n)
    {
        int sum=0;
        while(n>0)
        {
            int l = n%10;
            n=n/10;
            sum+=(l*l);
        }

        return sum;
    }

    public boolean isHappy(int n) {
        int p1=n;
        int p2 = sum(n);

        while(p2!=1 && p1!=p2)
        {
            p1 = sum(p1);
            p2=sum(sum(p2));
        }

        return p2==1;
    }
}