class Solution {
public:
    int reverse(long x) {
        
            long int rev=0;
            if(x<0)
            {
                if(x*-1>pow(2,31))
                    return 0;
                x=x*-1;
                if(x>pow(2,31))
                    return 0;
                while(x>0)
                {
                    if(rev*10+x%10>=pow(2,31))
                        return 0;
                    rev=rev*10+x%10;
                    x=x/10;
                }
                rev=rev*-1;
            }

            else
            {
                if(x>pow(2,31))
                    return 0;
                while(x>0)
                {
                    if(rev*10+x%10>=pow(2,31))
                        return 0;
                    rev=rev*10+x%10;
                    x=x/10;
                }
            }
            return rev;
        
    }
};