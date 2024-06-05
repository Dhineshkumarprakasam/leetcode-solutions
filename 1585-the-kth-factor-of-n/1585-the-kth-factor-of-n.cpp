class Solution {
public:
    int kthFactor(int n, int k) {

        int number=0;
        int fin=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                 number+=1;
                 fin=i;
            }
               
            if(number==k)
                return fin;

        }

        return -1;

    }
};